package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.History;
import org.framework.git.rodolfod2r2.webflux.taskflow.repository.HistoryRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HistoryServiceImp implements GenericsInterfaceService<History> {

    final
    HistoryRepository historyRepository;

    public HistoryServiceImp(HistoryRepository historyRepository) {
        this.historyRepository = historyRepository;
    }

    public Flux<History> findAll() {
        return historyRepository.findAll();
    }

    public Mono<History> findById(String id) {
        return historyRepository.findById(id);
    }

    public Mono<History> save(History halo) {
        return historyRepository.save(halo);
    }

}
