package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Task;
import org.framework.git.rodolfod2r2.webflux.taskflow.repository.TaskRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TaskServiceImp implements GenericsInterfaceService<Task> {

    final
    TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Flux<Task> findAll() {
        return taskRepository.findAll();
    }

    public Mono<Task> findById(String id) {
        return taskRepository.findById(id);
    }

    public Mono<Task> save(Task task) {
        return taskRepository.save(task);
    }

}
