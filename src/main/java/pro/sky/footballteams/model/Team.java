package pro.sky.footballteams.model;

import java.util.Objects;

public class Team {

    private String name;
    private String country;
    private int year;

    public Team() {
    }

    public Team(String name, String country, int year) {
        this.name = name;
        this.country = country;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team team = (Team) o;
        return year == team.year && name.equals(team.name) && country.equals(team.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, country, year);
    }

    @Override
    public String toString() {
        return "Team{" +
                "title='" + name + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                '}';
    }
}
