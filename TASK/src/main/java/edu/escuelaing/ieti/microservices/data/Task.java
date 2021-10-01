package edu.escuelaing.ieti.microservices.data;

import edu.escuelaing.ieti.microservices.dto.TaskDto;
import java.util.UUID;
import java.util.Date;

public class Task {

    private String id;
    private String name;
    private String description;
    private TaskEnum status;
    private Date dueDate;
    private Date created;

    public Task(TaskDto taskDto) {
        this.id = UUID.randomUUID().toString();
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = taskDto.getStatus();
        this.dueDate = (Date) taskDto.getDueDate();
        this.created = (Date) taskDto.getCreated();
    }

    public Task(String id, TaskDto taskDto) {
        this.id = id;
        this.name = taskDto.getName();
        this.description = taskDto.getDescription();
        this.status = taskDto.getStatus();
        this.dueDate = (Date) taskDto.getDueDate();
        this.created = (Date) taskDto.getCreated();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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