package com.br.pratique.repository;

import com.br.pratique.entity.ProfileUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileUserRepository extends JpaRepository<ProfileUser, Long> {
}