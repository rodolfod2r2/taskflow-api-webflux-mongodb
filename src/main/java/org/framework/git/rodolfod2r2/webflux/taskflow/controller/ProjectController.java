package org.framework.git.rodolfod2r2.webflux.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Project;
import org.framework.git.rodolfod2r2.webflux.taskflow.service.ProjectServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/project")
public class ProjectController {

    final
    ProjectServiceImp projectServiceImp;

    public ProjectController(ProjectServiceImp projectServiceImp) {
        this.projectServiceImp = projectServiceImp;
    }

    @GetMapping
    public Flux<Project> getAllProject() {
        return projectServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Project> getProjectById(@PathVariable String id) {
        return projectServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Project> save(@RequestBody Project project) {
        return projectServiceImp.save(project);
    }

}
