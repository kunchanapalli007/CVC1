package com.cvc.cvc_backend.service;


import com.cvc.cvc_backend.model.Player;
import com.cvc.cvc_backend.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepo;

    public PlayerService(PlayerRepository playerRepo) {
        this.playerRepo = playerRepo;
    }

    public Player createPlayer(Player player) {
        return playerRepo.save(player);
    }

    public List<Player> getPlayersByTeamId(Long teamId) {
        return playerRepo.findByTeamId(teamId);
    }

    public List<Player> getAllPlayers() {
        return playerRepo.findAll();
    }
}
