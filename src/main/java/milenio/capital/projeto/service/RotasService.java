package milenio.capital.projeto.service;

import milenio.capital.projeto.entity.Rotas;
import milenio.capital.projeto.repository.RotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RotasService {

    @Autowired
    private RotasRepository rotasRepository;

    public Rotas salvar(Rotas rotas){
        return rotasRepository.save(rotas);
    }

    public List<Rotas> listaRotas(){
        return rotasRepository.findAll();
    }

    public Optional<Rotas> buscarId(Long id){
        return rotasRepository.findById(id);
    }
}