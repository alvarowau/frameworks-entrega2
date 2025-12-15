package com.alvarobajo.entrega2.model;

import java.util.Map;

public interface Shape {
    double calculateArea();
    String getName();
    String getImagePath();
    Map<String, Double> getParameters();
    String getFormulaUrl();
}
