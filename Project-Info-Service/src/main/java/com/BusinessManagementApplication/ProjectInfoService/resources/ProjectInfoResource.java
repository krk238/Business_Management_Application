// ProjectInfoResource is the RESTful webservice/API; handling HTTP requests for the /projects and /projects/{projectID} URIs.
// This class is a "RESTful web service" AND "RESTful web service endpoint" AND "Spring MVC Controller"
// - RESTful web service b/c it provides overall functionality over HTTP using REST architectural principles.
// - RESTful web service Endpoint b/c it contains methods, (which are considered Endpoints), annotated with @RequestMapping that map to specific HTTP requests and return JSON responses to the client.
// - Spring MVC Controller b/c it contains the @RestController annotation; handling incoming HTTP requests and produces HTTP responses, which is what controllers basically do.

package com.BusinessManagementApplication.ProjectInfoService.resources;

import com.BusinessManagementApplication.ProjectInfoService.models.Project;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // http://http://localhost:8081/projects    - This annotation tells Spring that this class contains RESTful endpoints.
public class ProjectInfoResource {
    // This is hardcoded data to substitute a database for the time being.
    List<Project> projects = Arrays.asList(
            new Project(1234L, "OrionMission"),
            new Project(2234L, "MarsMission"),
            new Project(3234L, "SpaceXCollaborate")
    );

    @RequestMapping("/projects")   // - "/projects" is the RESTful endpoint, URI.
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

