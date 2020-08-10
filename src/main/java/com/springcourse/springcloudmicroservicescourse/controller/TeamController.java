package com.springcourse.springcloudmicroservicescourse.controller;

import com.springcourse.springcloudmicroservicescourse.model.Team;
import com.springcourse.springcloudmicroservicescourse.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping(path = "/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }
}