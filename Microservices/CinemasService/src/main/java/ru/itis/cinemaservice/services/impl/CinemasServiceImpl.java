package ru.itis.cinemaservice.services.impl;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import ru.itis.cinemaservice.dto.CinemaDto;
import ru.itis.cinemaservice.repos.CinemasRepository;
import ru.itis.cinemaservice.services.CinemasService;

import java.util.List;

@Service
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class CinemasServiceImpl implements CinemasService {

    CinemasRepository cinemasRepository;

    @Override
    public List<CinemaDto> readListByCityName(String cityName) {
        return CinemaDto.from(cinemasRepository.getAllByCityName(cityName));
    }
}
