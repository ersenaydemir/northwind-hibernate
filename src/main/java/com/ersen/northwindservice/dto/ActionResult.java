package com.ersen.northwindservice.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActionResult implements Serializable {
    private static final long serialVersionUID = 6977907416460422237L;
    private boolean success;
    private String message;
    private Object data;
}
