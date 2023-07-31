package com.betrybe.museumfinder.exception;

/**
 * Exceção personalizada para indicar que um museu não foi encontrado.
 * Esta é uma exceção não verificada, o que significa que não é obrigatória
 * de ser declarada ou capturada explicitamente em uma cláusula throws, ou
 * em um bloco try-catch.
 */
public class MuseumNotFoundException extends RuntimeException {

  /**
   * Cria uma instância de MuseumNotFoundException sem uma mensagem específica.
   */
  public MuseumNotFoundException() {
    super();
  }

  /**
   * Cria uma instância de MuseumNotFoundException com uma mensagem de erro específica.
   *
   * @param message A mensagem de erro detalhando o motivo da exceção.
   */
  public MuseumNotFoundException(String message) {
    super(message);
  }

  /**
   * Cria uma instância de MuseumNotFoundException com uma mensagem de erro específica
   * e a causa original da exceção.
   *
   * @param message A mensagem de erro detalhando o motivo da exceção.
   * @param cause   A causa original da exceção.
   */
  public MuseumNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Cria uma instância de MuseumNotFoundException com a causa original da exceção.
   *
   * @param cause A causa original da exceção.
   */
  public MuseumNotFoundException(Throwable cause) {
    super(cause);
  }
}
