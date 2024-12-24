package ru.test.dao;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {


    @PostMapping(path = "/name")

    public ResponseEntity<String> transferProcessing(@RequestBody ) {


        return new ResponseEntity<>(resp.toString(), HttpStatusCode.valueOf(400));
    }
}