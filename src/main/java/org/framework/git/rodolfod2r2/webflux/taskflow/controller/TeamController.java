package org.framework.git.rodolfod2r2.webflux.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Team;
import org.framework.git.rodolfod2r2.webflux.taskflow.service.TeamServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/team")
public class TeamController {

    final
    TeamServiceImp teamServiceImp;

    public TeamController(TeamServiceImp teamServiceImp) {
        this.teamServiceImp = teamServiceImp;
    }

    @GetMapping
    public Flux<Team> getAllTeam() {
        return teamServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Team> getTeamById(@PathVariable String id) {
        return teamServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Team> save(@RequestBody Team team) {
        return teamServiceImp.save(team);
    }

}
