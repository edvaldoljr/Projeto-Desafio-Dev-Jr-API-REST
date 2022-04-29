package milenio.capital.projeto.controller;

import milenio.capital.projeto.entity.Rotas;
import milenio.capital.projeto.service.RotasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/rotas")
public class RotasController {

    @Autowired
    private RotasService rotasService;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public Rotas salvar(@RequestBody Rotas rotas){
        return rotasService.salvar(rotas);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Rotas> listaRotas(){
        return rotasService.listaRotas();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Rotas buscarId(@PathVariable("id") Long id){
        return rotasService.buscarId(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id não encontrado na base de dados"));
    }
}
