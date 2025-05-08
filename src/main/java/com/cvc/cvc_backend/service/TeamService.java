package com.cvc.cvc_backend.service;


import com.cvc.cvc_backend.model.Team;
import com.cvc.cvc_backend.repository.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepo;

    public TeamService(TeamRepository teamRepo) {
        this.teamRepo = teamRepo;
    }

    public List<Team> getAllTeams() {
        return teamRepo.findAll();
    }

    public Team createTeam(Team team) {
        return teamRepo.save(team);
    }
}
