package ru.itis.hotelservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.hotelservice.models.HotelDb;

import java.util.List;

public interface HotelsRepository extends JpaRepository<HotelDb, Long> {

    List<HotelDb> getAllByCityName(String cityName);
}
