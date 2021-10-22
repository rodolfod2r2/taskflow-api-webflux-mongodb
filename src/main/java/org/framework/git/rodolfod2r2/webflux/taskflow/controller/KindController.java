package org.framework.git.rodolfod2r2.webflux.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Kind;
import org.framework.git.rodolfod2r2.webflux.taskflow.service.KindServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/history")
public class KindController {

    final
    KindServiceImp kindServiceImp;

    public KindController(KindServiceImp kindServiceImp) {
        this.kindServiceImp = kindServiceImp;
    }

    @GetMapping
    public Flux<Kind> getAllKind() {
        return kindServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Kind> getKindById(@PathVariable String id) {
        return kindServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Kind> save(@RequestBody Kind kind) {
        return kindServiceImp.save(kind);
    }

}
