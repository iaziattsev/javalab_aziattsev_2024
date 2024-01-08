package ru.itis.hotelservice.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.hotelservice.models.HotelDb;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "Hotel", description = "Отель")
public class HotelDto {

    @Schema(description = "Идентификатор", example = "1")
    private Long id;

    @Schema(description = "Наименование отеля", example = "Kazan five stars", maxLength = 255)
    private String name;

    @Schema(description = "Город, где находится отель", example = "Казань", maxLength = 100)
    private String cityName;


    public static HotelDto from(HotelDb db) {
        return HotelDto.builder()
                .id(db.getId())
                .name(db.getName())
                .cityName(db.getCityName())
                .build();
    }

    public static List<HotelDto> from(List<HotelDb> dbList) {
        return dbList.stream()
                .map(HotelDto::from)
                .collect(Collectors.toList());
    }
}
