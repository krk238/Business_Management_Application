package com.BusinessManagementApplication.ProjectInfoService.resources;

import com.BusinessManagementApplication.ProjectInfoService.models.Project;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // http://http://localhost:8081/projects
public class ProjectInfoResource {
    // This is hardcoded data to substitute a database for the time being.
    List<Project> projects = Arrays.asList(
            new Project(1234L, "OrionMission"),
            new Project(2234L, "MarsMission"),
            new Project(3234L, "SpaceXCollaborate")
    );

    @RequestMapping("/projects")
    public List<Project> allProjects() {
        return projects;
    }

    // The method below will be changed to search a database for a project once we connect a database.
    @RequestMapping("/projects/{projectID}")
    public String getProject(@PathVariable("projectID") Long projectID) {
        try {
            Project matchingProject = null;
            for (Project project : projects) {
                if (project.getProjectID().equals(projectID)) {
                    matchingProject = project;
                    break;
                }
            }
            if (matchingProject != null) {
                return matchingProject.toString();
            } else {
                return "No project found with ID " + projectID;
            }
        } catch (Exception e) {
            return "An error occurred: " + e.getMessage();
        }
    }
}

