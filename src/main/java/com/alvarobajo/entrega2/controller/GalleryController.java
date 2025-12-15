package com.alvarobajo.entrega2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador encargado de mostrar la galería de imágenes
 * almacenadas de forma estática en la aplicación.
 */
@Controller
public class GalleryController {

    /**
     * Muestra la página de la galería de imágenes.
     *
     * @return Vista gallery.html
     */
    @GetMapping("/gallery")
    public String gallery() {
        return "gallery";
    }
}
