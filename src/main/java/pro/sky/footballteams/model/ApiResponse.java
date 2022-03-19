package pro.sky.footballteams.model;

import java.util.Objects;

public class ApiResponse {
    private Response api;

    public ApiResponse() {
    }

    public Response getApi() {
        return api;
    }

    public void setApi(Response api) {
        this.api = api;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ApiResponse)) return false;
        ApiResponse that = (ApiResponse) o;
        return Objects.equals(api, that.api);
    }

    @Override
    public int hashCode() {
        return Objects.hash(api);
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "api=" + api +
                '}';
    }
}
