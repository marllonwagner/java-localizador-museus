package com.betrybe.museumfinder.model;

/**
 * Representa um objeto de museu.
 */
public class Museum {

  private Long id;                // Identificador único do museu.
  private String name;            // Nome do museu.
  private String description;     // Descrição do museu.
  private String address;         // Endereço do museu.
  private String collectionType;  // Tipo de coleção no museu(por exemplo: arte, história, ciência).
  private String subject;         // Assunto ou tema do museu (por exemplo: história antiga).
  private String url;             // URL do site do museu.
  private Coordinate coordinate;  // Coordenadas de latitude e longitude do local do museu.
  private Long legacyId;          // Identificador legado do museu.

  /**
   * Obtém o identificador do museu.
   *
   * @return O identificador único do museu.
   */
  public Long getId() {
    return id;
  }

  /**
   * Define o identificador do museu.
   *
   * @param id O novo identificador único do museu.
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Obtém o nome do museu.
   *
   * @return O nome do museu.
   */
  public String getName() {
    return name;
  }

  /**
   * Define o nome do museu.
   *
   * @param name O novo nome do museu.
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Obtém a descrição do museu.
   *
   * @return A descrição do museu.
   */
  public String getDescription() {
    return description;
  }

  /**
   * Define a descrição do museu.
   *
   * @param description A nova descrição do museu.
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Obtém o endereço do museu.
   *
   * @return O endereço do museu.
   */
  public String getAddress() {
    return address;
  }

  /**
   * Define o endereço do museu.
   *
   * @param address O novo endereço do museu.
   */
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   * Obtém o tipo de coleção no museu.
   *
   * @return O tipo de coleção no museu.
   */
  public String getCollectionType() {
    return collectionType;
  }

  /**
   * Define o tipo de coleção no museu.
   *
   * @param collectionType O novo tipo de coleção no museu.
   */
  public void setCollectionType(String collectionType) {
    this.collectionType = collectionType;
  }

  /**
   * Obtém o assunto ou tema do museu.
   *
   * @return O assunto ou tema do museu.
   */
  public String getSubject() {
    return subject;
  }

  /**
   * Define o assunto ou tema do museu.
   *
   * @param subject O novo assunto ou tema do museu.
   */
  public void setSubject(String subject) {
    this.subject = subject;
  }

  /**
   * Obtém a URL do site do museu.
   *
   * @return A URL do site do museu.
   */
  public String getUrl() {
    return url;
  }

  /**
   * Define a URL do site do museu.
   *
   * @param url A nova URL do site do museu.
   */
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Obtém as coordenadas de latitude e longitude do local do museu.
   *
   * @return As coordenadas de latitude e longitude do local do museu.
   */
  public Coordinate getCoordinate() {
    return coordinate;
  }

  /**
   * Define as coordenadas de latitude e longitude do local do museu.
   *
   * @param coordinate As novas coordenadas de latitude e longitude do local do museu.
   */
  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  /**
   * Obtém o identificador legado do museu.
   *
   * @return O identificador legado do museu.
   */
  public Long getLegacyId() {
    return legacyId;
  }

  /**
   * Define o identificador legado do museu.
   *
   * @param legacyId O novo identificador legado do museu.
   */
  public void setLegacyId(Long legacyId) {
    this.legacyId = legacyId;
  }
}
