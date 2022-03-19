package pro.sky.footballteams.model;

import java.util.List;
import java.util.Objects;

public class Response {

    private int result;
    private List<Team> teams;
    private List<Country> countries;

    public Response() {
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;
        Response response = (Response) o;
        return result == response.result && teams.equals(response.teams) && countries.equals(response.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, teams, countries);
    }

    @Override
    public String toString() {
        return "Response{" +
                "result=" + result +
                ", teams=" + teams +
                ", countries=" + countries +
                '}';
    }
}
