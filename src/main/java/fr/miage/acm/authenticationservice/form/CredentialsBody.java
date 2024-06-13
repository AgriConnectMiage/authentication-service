package fr.miage.acm.authenticationservice.form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CredentialsBody {
    public String email;
    public String password;

    // Constructeurs, getters et setters
    public CredentialsBody() {}

    public CredentialsBody(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
