package ru.itis.hotelservice.services;

import ru.itis.hotelservice.dto.HotelDto;

import java.util.List;

public interface HotelsService {

    List<HotelDto> readListByCityName(String cityName);
}
