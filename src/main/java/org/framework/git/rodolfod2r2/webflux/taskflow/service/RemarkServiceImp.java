package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Remark;
import org.framework.git.rodolfod2r2.webflux.taskflow.repository.RemarkRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RemarkServiceImp implements GenericsInterfaceService<Remark> {

    final
    RemarkRepository remarkRepository;

    public RemarkServiceImp(RemarkRepository remarkRepository) {
        this.remarkRepository = remarkRepository;
    }

    public Flux<Remark> findAll() {
        return remarkRepository.findAll();
    }

    public Mono<Remark> findById(String id) {
        return remarkRepository.findById(id);
    }

    public Mono<Remark> save(Remark remark) {
        return remarkRepository.save(remark);
    }

}
