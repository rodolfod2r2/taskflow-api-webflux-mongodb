package org.framework.git.rodolfod2r2.webflux.taskflow.service;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Archive;
import org.framework.git.rodolfod2r2.webflux.taskflow.repository.ArchiveRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ArchiveServiceImp implements GenericsInterfaceService<Archive> {

    final
    ArchiveRepository archiveRepository;

    public ArchiveServiceImp(ArchiveRepository archiveRepository) {
        this.archiveRepository = archiveRepository;
    }

    public Flux<Archive> findAll() {
        return archiveRepository.findAll();
    }

    public Mono<Archive> findById(String id) {
        return archiveRepository.findById(id);
    }

    public Mono<Archive> save(Archive archive) {
        return archiveRepository.save(archive);
    }
}
