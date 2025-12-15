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
public class TriangleScalene implements Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(
                s * (s - sideA) * (s - sideB) * (s - sideC)
        );
    }

    @Override
    public String getName() {
        return "Triángulo Escaleno";
    }

    @Override
    public String getImagePath() {
        return "/images/triangle_scalene.png";
    }

    @Override
    public Map<String, Double> getParameters() {
        Map<String, Double> params = new LinkedHashMap<>();
        params.put("Lado A", sideA);
        params.put("Lado B", sideB);
        params.put("Lado C", sideC);
        return params;
    }

    @Override
    public String getFormulaUrl() {
        return "https://es.wikipedia.org/wiki/Tri%C3%A1ngulo_escaleno";
    }

}
