package ru.test.dao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

@RestController
public class Controller {
    public Controller(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    DataSource dataSource;


    @GetMapping("/products/fetch-product")
    public ResponseEntity<?> transferProcessing(@RequestParam String name) {
        Processing testClass = new Processing(dataSource);
        List<?> result = testClass.query(name);
        if (!result.isEmpty()) {
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }
}