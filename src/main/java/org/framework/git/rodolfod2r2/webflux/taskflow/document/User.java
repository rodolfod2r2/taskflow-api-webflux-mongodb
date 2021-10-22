package org.framework.git.rodolfod2r2.webflux.taskflow.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private int xp;
    private int level;
    private Halo halo;
    private Family family;
    private Kind kind;
    private Archive archive;

}
