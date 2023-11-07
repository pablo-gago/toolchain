package com.systelab.toolchain.java17;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Java17App
{
  private static final Logger logger = LoggerFactory.getLogger(Java17App.class);


  void getJDK17Example(){
    // Uso de la nueva API de String (isBlank)
    String text = "   ";
    if (text.isBlank()) {
      logger.info("El texto está en blanco.");
    } else {
      logger.info("El texto no está en blanco.");
    }

    // Uso de la nueva API de Collections (List.of)
    List<String> colors = List.of("Rojo", "Verde", "Azul");
    logger.info("Colores: " + colors);

    // Uso de la inferencia de tipo local (var)
    var number = 42;
    logger.info("Número: " + number);

    // Uso de expresiones lambda mejoradas
    List<String> fruits = List.of("Manzana", "Plátano", "Naranja");
    fruits.forEach(fruit -> {
      logger.info("Fruta: " + fruit);
    });
    /*************************/
    // Uso de patrones de flujo (switch)
    String day = "Lunes";
    String typeOfDay = switch (day) {
      case "Lunes", "Martes", "Miércoles", "Jueves", "Viernes" -> "Día laborable";
      case "Sábado", "Domingo" -> "Fin de semana";
      default -> "Día desconocido";
    };

    logger.info("Hoy es " + day + " y es un " + typeOfDay);

    // Uso de bloques de texto
    String bloqueTexto = """
            Este es un bloque de texto
            en Java 17.
            """;
    logger.info(bloqueTexto);

    // Uso de la API de Streams
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);
    int sum = numbers.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();

    logger.info("La suma de los números pares es: " + sum);
  }
}
