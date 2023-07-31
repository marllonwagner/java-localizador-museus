package com.betrybe.museumfinder.controller;

import com.betrybe.museumfinder.dto.MuseumCreationDto;
import com.betrybe.museumfinder.dto.MuseumDto;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.service.MuseumServiceInterface;
import com.betrybe.museumfinder.util.ModelDtoConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller para manipulação de museus.
 */
@RestController
@RequestMapping("/museums")
public class MuseumController {

  private final MuseumServiceInterface museumService;

  /**
   * Construtor para o controller MuseumController.
   *
   * @param museumService O serviço de museus a ser injetado.
   */
  @Autowired
  public MuseumController(MuseumServiceInterface museumService) {
    this.museumService = museumService;
  }

  /**
   * Cria um museu através dos dados fornecidos no DTO de criação e retorna o DTO do museu criado.
   *
   * @param museumCreationDto O DTO de criação contendo os detalhes do museu a ser criado.
   * @return O DTO do museu criado com posição code 201 (CREATED).
   */
  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public MuseumDto createMuseum(@RequestBody MuseumCreationDto museumCreationDto) {
    Museum museum = museumService.createMuseum(ModelDtoConverter.dtoToModel(museumCreationDto));
    return ModelDtoConverter.modelToDto(museum);
  }

  /**
   * Retorna o museu mais próximo com base nas coordenadas fornecidas e na distância máxima.
   *
   * @param latitude     A latitude da localização para encontrar o museu mais próximo.
   * @param longitude    A longitude da localização para encontrar o museu mais próximo.
   * @param maxDistance  A distância máxima em quilômetros para considerar um museu próximo.
   * @return O DTO do museu mais próximo encontrado com status code 200 (OK).
   */
  @GetMapping("/closest")
  public MuseumDto getClosestMuseum(@RequestParam("lat") Double latitude,
      @RequestParam("lng") Double longitude,
      @RequestParam("max_dist_km") Double maxDistance) {
    Coordinate coordinate = new Coordinate(latitude, longitude);
    Museum closestMuseum = museumService.getClosestMuseum(coordinate, maxDistance);
    return ModelDtoConverter.modelToDto(closestMuseum);
  }
}
