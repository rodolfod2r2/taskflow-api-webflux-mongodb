package org.framework.git.rodolfod2r2.webflux.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Skill;
import org.framework.git.rodolfod2r2.webflux.taskflow.service.SkillServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/skill")
public class SkillController {

    final
    SkillServiceImp skillServiceImp;

    public SkillController(SkillServiceImp skillServiceImp) {
        this.skillServiceImp = skillServiceImp;
    }

    @GetMapping
    public Flux<Skill> getAllSkill() {
        return skillServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Skill> getSkillById(@PathVariable String id) {
        return skillServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Skill> save(@RequestBody Skill skill) {
        return skillServiceImp.save(skill);
    }

}
