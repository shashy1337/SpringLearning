package ru.shashy.restfulbegin;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france(){
        var c = Country.createContry("France", 68);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("City", "Paris")
                .body(c);
    }

    @GetMapping("/all")
    public List<Country> allC(){
        var c1 = Country.createContry("Russia", 300);
        var c2 = Country.createContry("France", 67);
        return List.of(c1, c2);
    }
}
