package ru.itis.cinemaservice.services;

import ru.itis.cinemaservice.dto.CinemaDto;

import java.util.List;

public interface CinemasService {

    List<CinemaDto> readListByCityName(String cityName);
}
