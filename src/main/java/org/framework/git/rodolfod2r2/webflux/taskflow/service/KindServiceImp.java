package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Kind;
import org.framework.git.rodolfod2r2.webflux.taskflow.repository.KindRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class KindServiceImp implements GenericsInterfaceService<Kind> {

    final
    KindRepository kindRepository;

    public KindServiceImp(KindRepository kindRepository) {
        this.kindRepository = kindRepository;
    }

    public Flux<Kind> findAll() {
        return kindRepository.findAll();
    }

    public Mono<Kind> findById(String id) {
        return kindRepository.findById(id);
    }

    public Mono<Kind> save(Kind kind) {
        return kindRepository.save(kind);
    }

}
