package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.User;
import org.framework.git.rodolfod2r2.webflux.taskflow.repository.UserRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImp implements GenericsInterfaceService<User> {

    final
    UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Flux<User> findAll() {
        return userRepository.findAll();
    }

    public Mono<User> findById(String id) {
        return userRepository.findById(id);
    }

    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

}
