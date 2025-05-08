package com.cvc.cvc_backend.repository;


import com.cvc.cvc_backend.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    List<Player> findByTeamId(Long teamId); // to get players by team
}
