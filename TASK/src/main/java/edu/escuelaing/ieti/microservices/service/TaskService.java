package edu.escuelaing.ieti.microservices.service;

import edu.escuelaing.ieti.microservices.dto.TaskDto;
import edu.escuelaing.ieti.microservices.data.Task;
import java.util.List;

public interface TaskService {

    Task create(TaskDto taskDto);

    Task findById(String id );

    List<Task> all();

    boolean deleteById( String id );

    Task update(TaskDto taskDto, String id );
}