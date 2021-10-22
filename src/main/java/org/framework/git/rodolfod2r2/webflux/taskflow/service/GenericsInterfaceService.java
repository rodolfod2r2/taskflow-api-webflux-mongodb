package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GenericsInterfaceService<T> {

    Flux<T> findAll();

    Mono<T> findById(String id);

    Mono<T> save(T t);

}
