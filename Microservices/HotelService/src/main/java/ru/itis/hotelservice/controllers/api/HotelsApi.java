package ru.itis.hotelservice.controllers.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.hotelservice.dto.HotelDto;

import java.util.List;

@Tags(value =
@Tag(name = "Hotels"))
@RequestMapping("/api/hotels")
public interface HotelsApi {

    @Operation(summary = "Получение списка отелей по названию города.", description = "Доступно всем пользователям")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Запрос обработан успешно",
                    content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = List.class))
                    })
    })
    @GetMapping
    ResponseEntity<List<HotelDto>> getHotels(
            @Parameter(description = "Название города", example = "Казань") @RequestParam("cityName") String cityName);


}
