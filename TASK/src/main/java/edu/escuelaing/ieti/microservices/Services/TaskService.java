package edu.escuelaing.ieti.microservices.Services;

import edu.escuelaing.ieti.microservices.Dto.TaskDto;
import org.springframework.scheduling.config.Task;
import java.util.List;

public interface TaskService {

    Task create(TaskDto taskDto);

    Task findById(String id );

    List<Task> all();

    boolean deleteById( String id );

    Task update(TaskDto taskDto, String id );
}