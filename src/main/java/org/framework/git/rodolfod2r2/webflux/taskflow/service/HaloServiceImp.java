package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Halo;
import org.framework.git.rodolfod2r2.webflux.taskflow.repository.HaloRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HaloServiceImp implements GenericsInterfaceService<Halo> {

    final
    HaloRepository haloRepository;

    public HaloServiceImp(HaloRepository haloRepository) {
        this.haloRepository = haloRepository;
    }

    public Flux<Halo> findAll() {
        return haloRepository.findAll();
    }

    public Mono<Halo> findById(String id) {
        return haloRepository.findById(id);
    }

    public Mono<Halo> save(Halo halo) {
        return haloRepository.save(halo);
    }

}
