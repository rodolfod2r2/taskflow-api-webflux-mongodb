package org.framework.git.rodolfod2r2.webflux.taskflow.controller;

import org.framework.git.rodolfod2r2.webflux.taskflow.document.Remark;
import org.framework.git.rodolfod2r2.webflux.taskflow.service.RemarkServiceImp;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/remark")
public class RemarkController {

    final
    RemarkServiceImp remarkServiceImp;

    public RemarkController(RemarkServiceImp remarkServiceImp) {
        this.remarkServiceImp = remarkServiceImp;
    }

    @GetMapping
    public Flux<Remark> getAllRemark() {
        return remarkServiceImp.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<Remark> getRemarkById(@PathVariable String id) {
        return remarkServiceImp.findById(id);
    }

    @PostMapping
    public Mono<Remark> save(@RequestBody Remark remark) {
        return remarkServiceImp.save(remark);
    }

}
