package com.betrybe.museumfinder.advice;

import com.betrybe.museumfinder.exception.InvalidCoordinateException;
import com.betrybe.museumfinder.exception.MuseumNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Classe que define controlador de exceções personalizado para manipulação de exceções específicas.
 */
@ControllerAdvice
public class CustomExceptionHandler {

  /**
   * Tratador de exceções genérico que captura exceções não tratadas e retorna um code 500 com a
   * mensagem "Erro interno!".
   *
   * @param ex A exceção não tratada.
   * @return ResponseEntity com code 500 (INTERNAL SERVER ERROR) e mensagem "Erro interno!".
   */
  @ExceptionHandler
  public ResponseEntity<String> handleGenericException(Exception ex) {
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno!");
  }

  /**
   * Tratador de exceções para a exceção InvalidCoordinateException.
   *
   * @param ex A exceção InvalidCoordinateException capturada.
   * @return ResponseEntity com code 400 (BAD REQUEST) e mensagem "Coordenada inválida!".
   */
  @ExceptionHandler(InvalidCoordinateException.class)
  public ResponseEntity<String> handleInvalidCoordinateException(InvalidCoordinateException ex) {
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Coordenada inválida!");
  }

  /**
   * Tratador de exceções para a exceção MuseumNotFoundException.
   *
   * @param ex A exceção MuseumNotFoundException capturada.
   * @return ResponseEntity com code 404 (NOT FOUND) e mensagem "Museu não encontrado!".
   */
  @ExceptionHandler(MuseumNotFoundException.class)
  public ResponseEntity<String> handleMuseumNotFoundException(MuseumNotFoundException ex) {
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Museu não encontrado!");
  }
}
