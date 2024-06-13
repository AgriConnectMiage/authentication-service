package fr.miage.acm.authenticationservice.authentication;

import fr.miage.acm.authenticationservice.form.CredentialsBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<String> authenticate(@RequestBody CredentialsBody credentials) {
        boolean isAuthenticated = authenticationService.authenticate(credentials);
        if (isAuthenticated) {
            return ResponseEntity.ok("Authentication successful");
        } else {
            return ResponseEntity.status(401).body("Authentication failed");
        }
    }
}
