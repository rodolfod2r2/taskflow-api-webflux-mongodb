package org.framework.git.rodolfod2r2.webflux.taskflow.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomResponse<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String error;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T data;

    public CustomResponse(int status, String message, String error, T data) {
        this.status = status;
        this.message = message;
        this.error = error;
        this.data = data;
    }

    public CustomResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public CustomResponse(int status, String message, String error) {
        this.status = status;
        this.message = message;
        this.error = error;
    }

    public CustomResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

}

