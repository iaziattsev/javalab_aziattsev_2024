package ru.itis.smartclient.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.smartclient.dto.CinemaDto;

import java.util.List;

@FeignClient(name = "cinemas-service", url = "${feign.cinemas-service.url}")
public interface CinemasService {

    @GetMapping(value = "/api/cinemas", consumes = MediaType.APPLICATION_JSON_VALUE)
    List<CinemaDto> getCinemas(
            @RequestParam("cityName") String cityName,
            @RequestParam("api-key") String apiKey);
}
