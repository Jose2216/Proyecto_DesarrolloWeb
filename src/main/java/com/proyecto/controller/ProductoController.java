package com.proyecto.controller;

import com.proyecto.domain.Categoria;
import com.proyecto.domain.PopularSeries;
import com.proyecto.service.CategoriaService;
import com.proyecto.service.PopularSeriesService;
import com.proyecto.service.ProductoService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private PopularSeriesService popularSeriesService;

    @Autowired
    private ProductoService productoService;

    @Autowired
    private CategoriaService categoriaService;

    // Método para listar categorías y series populares 
    @GetMapping("/listado")
    public String Inicio(Model model) {
        var productos = productoService.getProductos(false);
        List<Categoria> categorias = categoriaService.getCategorias(false);
        List<PopularSeries> popularSeries = popularSeriesService.getPopularSeries(false);
        model.addAttribute("categorias", categorias);
        model.addAttribute("popularseries", popularSeries);
        model.addAttribute("totalProductos", productos.size());
        return "/producto/listado";
    }

    @GetMapping("/listado/categoria/{idCategoria}")
    public String ProductosPorCategoria(Categoria categoria, Model model) {
        var productos = categoriaService.getCategoria(categoria).getProductos();
        var categorias = categoriaService.getCategorias(false);
        model.addAttribute("productos", productos);
        model.addAttribute("categorias", categorias);
        model.addAttribute("totalProductos", productos.size());
        return "/producto/listado";
    }

    @GetMapping("/listado/serie/{idPSerie}")
    public String ProductosPorSerie(PopularSeries PSerie, Model model) {
        var productos = popularSeriesService.getPopularSerie(PSerie).getProductos();
        var popularSeries = popularSeriesService.getPopularSeries(false);
        model.addAttribute("productos", productos);
        model.addAttribute("popularseries", popularSeries);
        model.addAttribute("totalProductos", productos.size());
        return "/producto/listado";
    }

}
