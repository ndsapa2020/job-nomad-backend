package net.nurlans.jobnomad.repository;

import net.nurlans.jobnomad.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getUserById(Long id);
}
