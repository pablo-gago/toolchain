package com.systelab.toolchain.java8;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Java8App
{
  private static final Logger logger = LoggerFactory.getLogger(Java8App.class);

  public void getJDK8Example (){
    // Uso de la nueva API de String (isEmpty)
    String text = "   ";
    if (text.trim().isEmpty()) {
      logger.info("El texto está en blanco.");
    } else {
      logger.info("El texto no está en blanco.");
    }

    // Uso de la nueva API de Collections (Arrays.asList)
    List<String> colors = Arrays.asList("Rojo", "Verde", "Azul");
    logger.info("Colores: " + colors);

    // No se usa var (inferencia de tipo local)
    int number = 42;
    logger.info("Número: " + number);

    // Uso de expresiones lambda
    List<String> fruits = Arrays.asList("Manzana", "Plátano", "Naranja");
    fruits.forEach(fruit -> {
      logger.info("Fruta: " + fruit);
    });
  }
}
