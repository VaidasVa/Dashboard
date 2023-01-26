package com.preinternship.dashboard.repositories;

import com.preinternship.dashboard.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> { // --> interface .. extends jpa crud
}
