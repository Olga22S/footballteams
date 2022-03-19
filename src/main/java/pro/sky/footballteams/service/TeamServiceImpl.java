package pro.sky.footballteams.service;

import org.springframework.stereotype.Service;
import pro.sky.footballteams.component.WebClient;
import pro.sky.footballteams.model.ApiResponse;

@Service
public class TeamServiceImpl implements TeamService{

    private final WebClient webClient;

    public TeamServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public ApiResponse getTeams(String country) {
        return webClient.getTeams(country);
    }
}
