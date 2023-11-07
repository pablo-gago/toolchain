package com.systelab.toolchain.java11;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Java11App
{
  private static final Logger logger = LoggerFactory.getLogger(Java11App.class);

  public void getJDK11Example(){
    String text = "   ";
    if (text.isBlank()) {
      logger.info("El texto está en blanco.");
    } else {
      logger.info("El texto no está en blanco.");
    }

    // Uso de la nueva API de Collections (of)
    List<String> colors = List.of("Rojo", "Verde", "Azul");
    logger.info("Colores: " + colors);

    // Uso de var (inferencia de tipo local)
    var number= 42;
    logger.info("Número: " + number);

    // Uso de expresiones lambda mejoradas
    List<String> fruits = Arrays.asList("Manzana", "Plátano", "Naranja");
    fruits.forEach(fruit -> {
      logger.info("Fruta: " + fruit);
    });
  }
}
