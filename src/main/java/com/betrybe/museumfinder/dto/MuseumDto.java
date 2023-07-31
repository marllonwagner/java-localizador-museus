package com.betrybe.museumfinder.dto;

import com.betrybe.museumfinder.model.Coordinate;

/**
 * DTO (Data Transfer Object) para representar um museu.
 * Este DTO contém os atributos que representam as informações de um museu.
 */
public record MuseumDto(
    Long id,
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
