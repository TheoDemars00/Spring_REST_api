package tdemars.rest_api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tdemars.rest_api.dao.TeamRepository;
import tdemars.rest_api.domain.Team;
import tdemars.rest_api.service.TeamService;

@Service
@Transactional
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepository teamRepository;

    @Override
    public Team createTeam(Team team) {
        return this.teamRepository.save(team);
    }

    @Override
    public void deleteTeam(Long id) {
        this.teamRepository.deleteById(id);
        
    }

    @Override
    public List<Team> findAllTeams() {
        return this.teamRepository.findAll();
    }

    @Override
    public Team findTeam(Long id) {
        return this.teamRepository.findById(id).orElse(null);
    }

    @Override
    public Team saveTeam(Team foundTeam) {
        return this.teamRepository.save(foundTeam);
    }

    
    
}
