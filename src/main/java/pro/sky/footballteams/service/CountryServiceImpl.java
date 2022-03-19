package pro.sky.footballteams.service;

import org.springframework.stereotype.Service;
import pro.sky.footballteams.component.WebClient;
import pro.sky.footballteams.model.ApiResponse;

@Service
public class CountryServiceImpl implements CountryService {

    private final WebClient webClient;

    public CountryServiceImpl(WebClient webClient) {
        this.webClient = webClient;
    }

    @Override
    public ApiResponse getCountries() {
        return webClient.getCountries();
    }
}
