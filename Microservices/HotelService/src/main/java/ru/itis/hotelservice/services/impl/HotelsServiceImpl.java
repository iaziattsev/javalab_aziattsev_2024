package ru.itis.hotelservice.services.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import ru.itis.hotelservice.dto.HotelDto;
import ru.itis.hotelservice.repos.HotelsRepository;
import ru.itis.hotelservice.services.HotelsService;

import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class HotelsServiceImpl implements HotelsService {

    HotelsRepository hotelsRepository;

    @Override
    public List<HotelDto> readListByCityName(String cityName) {
        return HotelDto.from(hotelsRepository.getAllByCityName(cityName));
    }
}
