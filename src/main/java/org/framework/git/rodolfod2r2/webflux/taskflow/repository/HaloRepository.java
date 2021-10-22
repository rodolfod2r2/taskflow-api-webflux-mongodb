package org.framework.git.rodolfod2r2.webflux.taskflow.repository;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Halo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories
public interface HaloRepository extends ReactiveMongoRepository<Halo, String> {
}
