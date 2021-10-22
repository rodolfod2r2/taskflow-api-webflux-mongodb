package org.framework.git.rodolfod2r2.webflux.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Halo;
import org.framework.git.rodolfod2r2.webflux.taskflow.service.HaloServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/halo")
public class HaloController {

    final
    HaloServiceImp haloServiceImp;

    public HaloController(HaloServiceImp haloServiceImp) {
        this.haloServiceImp = haloServiceImp;
    }

    @GetMapping
    public Flux<Halo> getAllHalo() {
        return haloServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Halo> getHaloById(@PathVariable String id) {
        return haloServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Halo> save(@RequestBody Halo halo) {
        return haloServiceImp.save(halo);
    }

}
