package com.alvarobajo.entrega2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TriangleIsosceles implements Shape {

    private double base;
    private double side;

    @Override
    public double calculateArea() {
        double height = Math.sqrt(Math.pow(side, 2) - Math.pow(base / 2, 2));
        return (base * height) / 2;
    }

    @Override
    public String getName() {
        return "Triángulo Isósceles";
    }

    @Override
    public String getImagePath() {
        return "/images/triangle_isosceles.png";
    }

    @Override
    public Map<String, Double> getParameters() {
        Map<String, Double> params = new LinkedHashMap<>();
        params.put("Base", base);
        params.put("Lado", side);
        return params;
    }

    @Override
    public String getFormulaUrl() {
        return "https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_is%C3%B3sceles";
    }

}
