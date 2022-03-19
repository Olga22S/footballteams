package pro.sky.footballteams.service;

import pro.sky.footballteams.model.ApiResponse;

public interface TeamService {

    ApiResponse getTeams(String country);
}
