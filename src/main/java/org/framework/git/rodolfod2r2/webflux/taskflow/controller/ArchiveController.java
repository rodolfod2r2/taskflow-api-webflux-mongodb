package org.framework.git.rodolfod2r2.webflux.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Archive;
import org.framework.git.rodolfod2r2.webflux.taskflow.service.ArchiveServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/archive")
public class ArchiveController {

    final
    ArchiveServiceImp archiveServiceImp;

    public ArchiveController(ArchiveServiceImp archiveServiceImp) {
        this.archiveServiceImp = archiveServiceImp;
    }

    @GetMapping
    public Flux<Archive> getAllArchive() {
        return archiveServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Archive> getArchiveById(@PathVariable String id) {
        return archiveServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Archive> save(@RequestBody Archive archive) {
        return archiveServiceImp.save(archive);
    }

}
