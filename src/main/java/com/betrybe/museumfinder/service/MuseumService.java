package com.betrybe.museumfinder.service;

import com.betrybe.museumfinder.database.MuseumFakeDatabase;
import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import com.betrybe.museumfinder.model.Coordinate;
import com.betrybe.museumfinder.model.Museum;
import com.betrybe.museumfinder.util.CoordinateUtil;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementação do serviço para operações relacionadas aos museus.
 */
@Service
public class MuseumService implements MuseumServiceInterface {

  private final MuseumFakeDatabase museumFakeDatabase;

  /**
   * Construtor para o serviço MuseumService.
   *
   * @param museumFakeDatabase O banco de dados falso de museus a ser injetado.
   */
  @Autowired
  public MuseumService(MuseumFakeDatabase museumFakeDatabase) {
    this.museumFakeDatabase = museumFakeDatabase;
  }

  /**
   * Retorna o museu mais próximo com base nas coordenadas fornecidas.
   *
   * @param coordinate  As coordenadas para encontrar o museu mais próximo.
   * @param maxDistance A distância máxima para considerar um museu próximo.
   * @return O objeto Museum representando o museu mais próximo, ou null se não houver museus near.
   */
  @Override
  public Museum getClosestMuseum(Coordinate coordinate, Double maxDistance) {
    validateCoordinates(coordinate);
    Optional<Museum> isMuseumFound = museumFakeDatabase.getClosestMuseum(coordinate, maxDistance);
    if (isMuseumFound.isPresent()) {
      return isMuseumFound.get();
    } else {
      throw new MuseumNotFoundException();
    }
  }

  /**
   * Cria um museu e o salva no banco de dados falso.
   *
   * @param museum O objeto Museum contendo os detalhes do museu a ser criado.
   * @return O novo objeto Museum após ser salvo no banco de dados.
   * @throws InvalidCoordinateException Se as coordenadas do museu forem inválidas.
   */
  @Override
  public Museum createMuseum(Museum museum) throws InvalidCoordinateException {
    validateCoordinates(museum.getCoordinate());
    return museumFakeDatabase.saveMuseum(museum);
  }

  /**
   * Obtém um museu pelo seu ID.
   *
   * @param id O ID do museu a ser obtido.
   * @return O objeto Museum representando o museu com o ID fornecido, ou null se não encontrado.
   */
  @Override
  public Museum getMuseum(Long id) {
    // Implementação do método getMuseum (não incluído no exemplo)
    return null;
  }

  /**
   * Valida coordenadas do museu e lança uma exceção InvalidCoordinateException se forem inválidas.
   *
   * @param coordinate As coordenadas do museu a serem validadas.
   * @throws InvalidCoordinateException Se as coordenadas do museu forem inválidas.
   */
  private void validateCoordinates(Coordinate coordinate) throws InvalidCoordinateException {
    if (!CoordinateUtil.isCoordinateValid(coordinate)) {
      throw new InvalidCoordinateException();
    }
  }
}
