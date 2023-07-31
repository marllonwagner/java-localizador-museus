package com.betrybe.museumfinder.exception;

/**
 * Exceção personalizada para indicar coordenadas inválidas.
 * Esta é uma exceção não verificada, o que significa que não é obrigatória
 * de ser declarada ou capturada explicitamente em uma cláusula throws, ou
 * em um bloco try-catch.
 */
public class InvalidCoordinateException extends RuntimeException {

  /**
   * Cria uma instância de InvalidCoordinateException sem uma mensagem específica.
   */
  public InvalidCoordinateException() {
    super();
  }

  /**
   * Cria uma instância de InvalidCoordinateException com uma mensagem de erro específica.
   *
   * @param message A mensagem de erro detalhando o motivo da exceção.
   */
  public InvalidCoordinateException(String message) {
    super(message);
  }

  /**
   * Cria uma instância de InvalidCoordinateException com uma mensagem de erro específica
   * e a causa original da exceção.
   *
   * @param message A mensagem de erro detalhando o motivo da exceção.
   * @param cause   A causa original da exceção.
   */
  public InvalidCoordinateException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Cria uma instância de InvalidCoordinateException com a causa original da exceção.
   *
   * @param cause A causa original da exceção.
   */
  public InvalidCoordinateException(Throwable cause) {
    super(cause);
  }
}
