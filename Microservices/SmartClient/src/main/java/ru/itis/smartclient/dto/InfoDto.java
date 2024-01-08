package ru.itis.smartclient.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InfoDto {

    private List<HotelDto> hotels;

    private List<CinemaDto> cinemas;

}
