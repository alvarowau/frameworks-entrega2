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
public class Rectangle implements Shape {

    private double base;
    private double height;

    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public String getName() {
        return "Rectángulo";
    }

    @Override
    public String getImagePath() {
        return "/images/rectangle.png";
    }

    @Override
    public Map<String, Double> getParameters() {
        Map<String, Double> params = new LinkedHashMap<>();
        params.put("Base", base);
        params.put("Altura", height);
        return params;
    }

    @Override
    public String getFormulaUrl() {
        return "https://es.wikipedia.org/wiki/Rect%C3%A1ngulo";
    }


}
