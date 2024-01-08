package ru.itis.smartclient.controllers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.smartclient.dto.CinemaDto;
import ru.itis.smartclient.dto.HotelDto;
import ru.itis.smartclient.dto.InfoDto;
import ru.itis.smartclient.services.CinemasService;
import ru.itis.smartclient.services.HotelsService;

import java.util.List;

@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
@RestController
public class InfoController {

    HotelsService hotelsService;
    CinemasService cinemasService;


    @GetMapping("/info")
    public ResponseEntity<InfoDto> getInfo(@RequestParam("cityName") String cityName) {
        List<HotelDto> hotels = hotelsService.getHotels(cityName, "ilovemycountry");
        List<CinemaDto> cinemas = cinemasService.getCinemas(cityName, "idontlovemycountry");

        return ResponseEntity.ok(InfoDto.builder()
                .cinemas(cinemas)
                .hotels(hotels)
                .build());
    }
}
