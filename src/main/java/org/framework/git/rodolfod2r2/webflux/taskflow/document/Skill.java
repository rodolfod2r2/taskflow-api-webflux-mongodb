package org.framework.git.rodolfod2r2.webflux.taskflow.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
public class Skill {

    @Id
    private String id;
    private String name;
    private int level;
    private User user;

}
