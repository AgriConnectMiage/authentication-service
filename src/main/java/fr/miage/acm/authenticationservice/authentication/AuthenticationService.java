package fr.miage.acm.authenticationservice.authentication;

import fr.miage.acm.authenticationservice.farmer.FarmerService;
import fr.miage.acm.authenticationservice.form.CredentialsBody;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    FarmerService farmerService;

    public AuthenticationService(FarmerService farmerService) {
        this.farmerService = farmerService;
    }

    public boolean authenticate(CredentialsBody credentials) {
        return farmerService.findByEmail(credentials.email)
                .map(farmer -> farmer.getPassword().equals(credentials.password))
                .orElse(false);

    }
}
