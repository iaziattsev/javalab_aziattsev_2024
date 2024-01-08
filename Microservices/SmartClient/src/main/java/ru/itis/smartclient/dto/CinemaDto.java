package ru.itis.smartclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CinemaDto {

    private Long id;

    private String name;

    private String cityName;
}
