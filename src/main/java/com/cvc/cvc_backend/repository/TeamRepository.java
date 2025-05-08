package com.cvc.cvc_backend.repository;


import com.cvc.cvc_backend.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
