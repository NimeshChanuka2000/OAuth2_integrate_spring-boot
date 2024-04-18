package lk.chanu.OAuth2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Oauth2Controller {

    @GetMapping("/demo")
    public ResponseEntity<String> secure(){
        return ResponseEntity.ok("This is the secure endpoint");
    }
}
