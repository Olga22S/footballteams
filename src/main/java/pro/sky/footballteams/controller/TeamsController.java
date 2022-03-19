package pro.sky.footballteams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.footballteams.model.ApiResponse;
import pro.sky.footballteams.service.CountryService;
import pro.sky.footballteams.service.TeamService;

@RestController
public class TeamsController {

    private final CountryService countryService;
    private final TeamService teamService;

    public TeamsController(CountryService countryService, TeamService teamService) {
        this.countryService = countryService;
        this.teamService = teamService;
    }

    @GetMapping
    public ApiResponse getCountries() {
        return countryService.getCountries();
    }

    @GetMapping("/teams")
    public ApiResponse getTeams(@RequestParam String country) {
        return teamService.getTeams(country);
    }
}
