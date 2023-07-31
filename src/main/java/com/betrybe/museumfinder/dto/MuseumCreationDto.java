package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * DTO (Data Transfer Object) para representar a criação de um museu.
 * Este DTO contém os atributos necessários para criar um objeto de museu.
 */
public record MuseumCreationDto(
    String name,
    String description,
    String address,
    String collectionType,
    String subject,
    String url,
    Coordinate coordinate
) {
  // Construtor (criado implicitamente pelo record)
}
