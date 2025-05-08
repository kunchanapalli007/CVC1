package com.cvc.cvc_backend.controller;

import com.cvc.cvc_backend.model.Player;
import com.cvc.cvc_backend.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/players")
@CrossOrigin(origins = "*")
public class PlayerController {

    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @PostMapping
    public Player createPlayer(@RequestBody Player player) {
        return playerService.createPlayer(player);
    }

    @GetMapping("/team/{teamId}")
    public List<Player> getPlayersByTeamId(@PathVariable Long teamId) {
        return playerService.getPlayersByTeamId(teamId);
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }
}
