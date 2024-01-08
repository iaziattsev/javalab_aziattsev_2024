package ru.itis.cinemaservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.cinemaservice.models.CinemaDb;

import java.util.List;

public interface CinemasRepository extends JpaRepository<CinemaDb, Long> {

    List<CinemaDb> getAllByCityName(String cityName);
}
