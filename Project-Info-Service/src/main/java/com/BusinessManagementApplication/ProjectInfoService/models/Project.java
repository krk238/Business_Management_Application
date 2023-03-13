package com.BusinessManagementApplication.ProjectInfoService.models;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectID")
    private Long projectID;
    @Column(name = "name")
    private String name;
    @Column(name = "profit")
    private String profit;
    @Column(name = "client")

    private String client;
    @Column(name = "description")
    private String description;
    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "completionDate")
    private LocalDate completionDate;

    @Column(name = "projectManager")
    private String projectManager;

    public Project() {}

    public Project(Long projectID, String name) {
        this.projectID = projectID;
        this.name = name;
    }

    public Project(Long projectID, String name, String profit, String client, String description, LocalDate startDate, LocalDate completionDate, String projectManager) {
        this.projectID = projectID;
        this.name = name;
        this.profit = profit;
        this.client = client;
        this.description = description;
        this.startDate = startDate;
        this.completionDate = completionDate;
        this.projectManager = projectManager;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectID=" + projectID +
                ", name='" + name + '\'' +
                ", profit='" + profit + '\'' +
                ", client='" + client + '\'' +
                ", description='" + description + '\'' +
                ", startDate=" + startDate +
                ", completionDate=" + completionDate +
                ", projectManager='" + projectManager + '\'' +
                '}';
    }

    public Long getProjectID() {
        return projectID;
    }

    public void setProjectID(Long projectID) {
        this.projectID = projectID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }


}
