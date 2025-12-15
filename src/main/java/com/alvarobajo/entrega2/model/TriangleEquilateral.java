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
public class TriangleEquilateral implements Shape{

    private double side;

    @Override
    public double calculateArea() {
        return (Math.sqrt(3)/4)*(side * side);
    }

    @Override
    public String getName() {
        return "Triangulo Equilatero";
    }

    @Override
    public String getImagePath() {
        return  "/images/triangle_equilateral.png";
    }

    @Override
    public Map<String, Double> getParameters() {
        Map<String, Double> params = new LinkedHashMap<>();
        params.put("Lado", side);
        return params;
    }
    @Override
    public String getFormulaUrl() {
        return "https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_equil%C3%A1tero";
    }
}
