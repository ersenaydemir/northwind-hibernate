package com.ersen.northwindservice.controller;

import com.ersen.northwindservice.dto.ActionResult;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping(value = "/home", produces = MediaType.APPLICATION_JSON_VALUE)
public class HomeController {

    @GetMapping(value = "/test/v1")
    public ActionResult test1() {
        return new ActionResult(true, new Date().toString(), null);
    }

    @GetMapping(value = "/test/v2")
    public ResponseEntity<ActionResult> test2() {
        return ResponseEntity.ok(new ActionResult(true, new Date().toString(), null));
    }
}
