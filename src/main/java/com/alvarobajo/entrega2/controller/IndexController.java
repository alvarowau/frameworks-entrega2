package com.alvarobajo.entrega2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Controlador principal de la aplicación.
 * Se encarga de mostrar la página de inicio con los enlaces
 * a las distintas funcionalidades disponibles.
 */
@Controller
public class IndexController {

    /**
     * Muestra la página de inicio de la aplicación.
     *
     * @param model Modelo utilizado para pasar la lista de enlaces a la vista.
     * @return Nombre de la vista index.html
     */
    @GetMapping("/")
    public String index(Model model) {

        List<Link> links = new ArrayList<>();

        // Enlace al selector de figuras para el cálculo de áreas
        links.add(new Link("Cálculo de áreas", "/area", false));

        // Enlace externo a la explicación teórica del concepto de área
        links.add(new Link(
                "Explicación del cálculo",
                "https://es.wikipedia.org/wiki/%C3%81rea",
                true
        ));

        // Enlace a la galería de imágenes internas
        links.add(new Link("Galería de imágenes", "/gallery", false));

        model.addAttribute("links", links);

        return "index";
    }

    /**
     * Clase auxiliar utilizada para representar los enlaces del índice.
     * Permite distinguir entre enlaces internos y externos.
     */
    private static class Link {

        private final String label;
        private final String url;
        private final boolean external;

        public Link(String label, String url, boolean external) {
            this.label = label;
            this.url = url;
            this.external = external;
        }

        public String getLabel() {
            return label;
        }

        public String getUrl() {
            return url;
        }

        public boolean isExternal() {
            return external;
        }
    }
}
