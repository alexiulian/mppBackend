package com.example.mppbackend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.mppbackend.api.models.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
    Optional<User> findByEmail(String email);
}
