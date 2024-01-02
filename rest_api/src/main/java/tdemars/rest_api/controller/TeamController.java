package tdemars.rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tdemars.rest_api.service.TeamService;
import tdemars.rest_api.domain.Team;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/teams")
    public List<Team> allTeams() {
        return this.teamService.findAllTeams();
    }

    @GetMapping("/teams/{id}")
    public Team oneTeam(@PathVariable Long id){
        return this.teamService.findTeam(id);
    }

    @PostMapping("/teams")
    public Team createTeam(@RequestBody Team team) {
		
		return this.teamService.createTeam(team);
	}

    @DeleteMapping("/teams/{id}")
    public void deleteTeam(@PathVariable Long id){
        this.teamService.deleteTeam(id);
    }

    @PutMapping("/teams/{id}")
    Team replacTeam(@RequestBody Team team, @PathVariable Long id){
        Team foundTeam = this.teamService.findTeam(id);

        if (team!=null){
            foundTeam.setName(team.getName());
            foundTeam.setCity(team.getCity());

            foundTeam = this.teamService.saveTeam(foundTeam);
        }
        return foundTeam;
    }
    
}
