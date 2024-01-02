package tdemars.rest_api.service;

import java.util.List;

import tdemars.rest_api.domain.Team;

public interface TeamService {
    
    public List<Team> findAllTeams();

    public Team findTeam(Long id);

    public Team createTeam (Team team);

    public void deleteTeam (Long id);

    public Team saveTeam (Team foundTeam);
}
