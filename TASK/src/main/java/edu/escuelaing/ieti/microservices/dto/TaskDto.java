package edu.escuelaing.ieti.microservices.dto;

import edu.escuelaing.ieti.microservices.data.TaskEnum;
import java.util.Date;

public class TaskDto {
    private String name;
    private String description;
    private TaskEnum status;
    private Date dueDate;
    private Date created;

    public TaskDto(String name, String description, TaskEnum status, Date dueDate, Date created) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.dueDate = dueDate;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskEnum getStatus() {
        return status;
    }

    public void setStatus(TaskEnum status) {
        this.status = status;
    }


    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
