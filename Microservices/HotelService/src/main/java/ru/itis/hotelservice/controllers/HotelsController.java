package ru.itis.hotelservice.controllers;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.hotelservice.controllers.api.HotelsApi;
import ru.itis.hotelservice.dto.HotelDto;
import ru.itis.hotelservice.services.HotelsService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class HotelsController implements HotelsApi {

    HotelsService hotelsService;

    @Override
    public ResponseEntity<List<HotelDto>> getHotels(String cityName) {
        return ResponseEntity.ok(hotelsService.readListByCityName(cityName));
    }
}
