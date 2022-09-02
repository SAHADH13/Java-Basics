package com.lxisoft.spring.repository;

import com.lxisoft.spring.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AppUserRepository extends JpaRepository<AppUser, String> {
}
