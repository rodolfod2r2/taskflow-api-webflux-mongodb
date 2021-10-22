package org.framework.git.rodolfod2r2.webflux.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.User;
import org.framework.git.rodolfod2r2.webflux.taskflow.service.UserServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    final
    UserServiceImp userServiceImp;

    public UserController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping
    public Flux<User> getAllUser() {
        return userServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userServiceImp.findById(id);
    }

    @PostMapping
    public Mono<User> save(@RequestBody User user) {
        return userServiceImp.save(user);
    }

}
