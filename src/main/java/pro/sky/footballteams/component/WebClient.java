package pro.sky.footballteams.component;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pro.sky.footballteams.model.ApiResponse;

import static pro.sky.footballteams.constants.ApiConstants.*;

@Component
public class WebClient {

    private final RestTemplate restTemplate;

    public WebClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ApiResponse getCountries() {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(KEY_HEADER, KEY);
        httpHeaders.add(HOST_HEADER, HOST);
        ResponseEntity<ApiResponse> entity = restTemplate.exchange(
                COUNTRIES_URL,
                HttpMethod.GET,
                new HttpEntity<ApiResponse>(httpHeaders),
                ApiResponse.class
        );
        return entity.getBody();
    }

    public ApiResponse getTeams(String country) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(KEY_HEADER, KEY);
        httpHeaders.add(HOST_HEADER, HOST);
        ResponseEntity<ApiResponse> entity = restTemplate.exchange(
                TEAMS_URL + country,
                HttpMethod.GET,
                new HttpEntity<ApiResponse>(httpHeaders),
                ApiResponse.class
        );
        return entity.getBody();
    }
}
