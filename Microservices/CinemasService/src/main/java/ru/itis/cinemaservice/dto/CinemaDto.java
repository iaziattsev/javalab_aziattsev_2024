package ru.itis.cinemaservice.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.cinemaservice.models.CinemaDb;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "Cinema", description = "Кинотеатр")
public class CinemaDto {

    @Schema(description = "Идентификатор", example = "1")
    private Long id;

    @Schema(description = "Наименование кинотеатра", example = "Kazan five stars", maxLength = 255)
    private String name;

    @Schema(description = "Город, где находится отель", example = "Казань", maxLength = 100)
    private String cityName;


    public static CinemaDto from(CinemaDb db) {
        return CinemaDto.builder()
                .id(db.getId())
                .name(db.getName())
                .cityName(db.getCityName())
                .build();
    }

    public static List<CinemaDto> from(List<CinemaDb> dbList) {
        return dbList.stream()
                .map(CinemaDto::from)
                .collect(Collectors.toList());
    }
}
