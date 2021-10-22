package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Gamification;
import org.framework.git.rodolfod2r2.webflux.taskflow.repository.GamificationRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GamificationServiceImp implements GenericsInterfaceService<Gamification> {

    final
    GamificationRepository gamificationRepository;

    public GamificationServiceImp(GamificationRepository gamificationRepository) {
        this.gamificationRepository = gamificationRepository;
    }

    public Flux<Gamification> findAll() {
        return gamificationRepository.findAll();
    }

    public Mono<Gamification> findById(String id) {
        return gamificationRepository.findById(id);
    }

    public Mono<Gamification> save(Gamification gamification) {
        return gamificationRepository.save(gamification);
    }
}
