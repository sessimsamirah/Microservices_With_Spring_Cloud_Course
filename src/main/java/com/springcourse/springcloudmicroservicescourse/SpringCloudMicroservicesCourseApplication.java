package com.springcourse.springcloudmicroservicescourse;

import com.springcourse.springcloudmicroservicescourse.model.Team;
import com.springcourse.springcloudmicroservicescourse.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan({"com.springcourse.springcloudmicroservicescourse.controller"})
@EnableJpaRepositories("com.springcourse.springcloudmicroservicescourse.repository.TeamRepository")
public class SpringCloudMicroservicesCourseApplication {

	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroservicesCourseApplication.class, args);
	}

	@PostConstruct
	public void init() {
		List<Team> teamList = new ArrayList<>();

		Team team = new Team();
		team.setId(1L);
		team.setLocation("Manchester");
		team.setName("Manchester United");
		teamList.add(team);

		team = new Team();
		team.setId(2L);
		team.setLocation("Paris");
		team.setName("Paris Saint-German");
		teamList.add(team);

		teamRepository.saveAll(teamList);
	}
}