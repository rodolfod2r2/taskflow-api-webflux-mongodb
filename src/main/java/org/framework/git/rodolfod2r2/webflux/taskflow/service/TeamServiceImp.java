package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Team;
import org.framework.git.rodolfod2r2.webflux.taskflow.repository.TeamRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TeamServiceImp implements GenericsInterfaceService<Team> {

    final
    TeamRepository teamRepository;

    public TeamServiceImp(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Flux<Team> findAll() {
        return teamRepository.findAll();
    }

    public Mono<Team> findById(String id) {
        return teamRepository.findById(id);
    }

    public Mono<Team> save(Team team) {
        return teamRepository.save(team);
    }

}
