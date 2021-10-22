package org.framework.git.rodolfod2r2.webflux.taskflow.document;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class History {

    @Id
    private String id;
    private User user;
    private String action;
    private Date dateAction;

}
