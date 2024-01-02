package tdemars.rest_api.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Team {

	private @Id @GeneratedValue Long id;

	private String name;

	private String city;

	public Team() {		
	}

	public Long getId(){
		return id;
	}

	public void setId(Long id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getCity(){
		return city;
	}

	public void setCity(String city){
		this.city = city;
	}

	public void setTeam(String name, String city) {
		this.name = name;
		this.city = city;
	}
    
}
