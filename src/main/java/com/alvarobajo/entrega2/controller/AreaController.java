package com.alvarobajo.entrega2.controller;

import com.alvarobajo.entrega2.model.Rectangle;
import com.alvarobajo.entrega2.model.TriangleEquilateral;
import com.alvarobajo.entrega2.model.TriangleIsosceles;
import com.alvarobajo.entrega2.model.TriangleScalene;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Controlador encargado de gestionar el cálculo de áreas
 * de las distintas figuras geométricas.
 */
@Controller
@RequestMapping("/area")
public class AreaController {

    /**
     * Muestra el selector de figuras geométricas.
     * Permite seleccionar la figura y, en el caso de los triángulos,
     * el tipo concreto de triángulo.
     *
     * @param shape Figura seleccionada (rectángulo o triángulo)
     * @param type  Tipo de triángulo (equilátero, isósceles, escaleno)
     * @param model Modelo utilizado para pasar los parámetros a la vista
     * @return Vista del selector de figuras
     */
    @GetMapping
    public String areaSelector(
            @RequestParam(required = false) String shape,
            @RequestParam(required = false) String type,
            Model model
    ) {
        model.addAttribute("shape", shape);
        model.addAttribute("type", type);
        return "shapeselector";
    }

    /**
     * Calcula el área de un rectángulo.
     *
     * @param rectangle Objeto Rectangle con los datos introducidos por el usuario
     * @param model     Modelo utilizado para enviar la figura a la vista de resultados
     * @return Vista de resultados
     */
    @PostMapping("/rectangle")
    public String rectangleCalculate(
            Rectangle rectangle,
            Model model
    ) {
        model.addAttribute("figure", rectangle);
        return "result";
    }

    /**
     * Calcula el área de un triángulo equilátero.
     */
    @PostMapping("/triangle/equilateral")
    public String triangleEquilateralCalculate(
            TriangleEquilateral triangleEquilateral,
            Model model
    ) {
        model.addAttribute("figure", triangleEquilateral);
        return "result";
    }

    /**
     * Calcula el área de un triángulo isósceles.
     */
    @PostMapping("/triangle/isosceles")
    public String triangleIsoscelesCalculate(
            TriangleIsosceles triangleIsosceles,
            Model model
    ) {
        model.addAttribute("figure", triangleIsosceles);
        return "result";
    }

    /**
     * Calcula el área de un triángulo escaleno.
     */
    @PostMapping("/triangle/scalene")
    public String triangleScaleneCalculate(
            TriangleScalene triangleScalene,
            Model model
    ) {
        model.addAttribute("figure", triangleScalene);
        return "result";
    }
}
