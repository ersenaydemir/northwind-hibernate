package com.ersen.northwindservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActionResult implements Serializable {
    private static final long serialVersionUID = 6977907416460422237L;
    private boolean success;
    private String message;
}
