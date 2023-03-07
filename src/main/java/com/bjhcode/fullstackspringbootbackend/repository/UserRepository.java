package com.bjhcode.fullstackspringbootbackend.repository;

import com.bjhcode.fullstackspringbootbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
