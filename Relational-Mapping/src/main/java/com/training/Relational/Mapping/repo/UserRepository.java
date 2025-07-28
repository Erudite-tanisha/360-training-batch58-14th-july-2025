package com.training.Relational.Mapping.repo;

import com.training.Relational.Mapping.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
