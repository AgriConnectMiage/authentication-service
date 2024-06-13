package fr.miage.acm.authenticationservice.farmer;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface FarmerRepository extends JpaRepository<Farmer, UUID> {
    Optional<Farmer> findByEmail(String email);

}
