package es.cic.curso25.proy006;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    // C R U D

    @PostMapping
    public long create(@RequestBody Libro libro){
        return libroService.create(libro);
    }

    @GetMapping
    public List<Libro> get(){
        List<Libro> libros = new ArrayList<>();

        Libro libro1 = new Libro();
        libro1.setId(101);
        libro1.setTitulo("La Rebelión del Tiempo");
        libro1.setIdAutor(1001);
        libro1.setFechaPublicacion("13 mayo 2009");
        libros.add(libro1);

        Libro libro2 = new Libro();
        libro2.setId(102);
        libro2.setTitulo("Las Voces del Viento");
        libro2.setIdAutor(1002);
        libro2.setFechaPublicacion("1 agosto 2016");
        libros.add(libro2);

        Libro libro3 = new Libro();
        libro3.setId(103);
        libro3.setTitulo("Marea de Cenizas");
        libro3.setIdAutor(1003);
        libro3.setFechaPublicacion("8 julio 2021");
        libros.add(libro3);

        return libros;
    }

    @GetMapping("/{id}")
    public Libro get(@PathVariable long id){
        Libro libro1 = new Libro();
        libro1.setTitulo("La Rebelión del Tiempo");
        libro1.setIdAutor(1001);
        libro1.setFechaPublicacion("13 mayo 2009");
        return libro1;
    }

    @PutMapping
    public void update(Libro libro){
        
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        
    }
        
}
