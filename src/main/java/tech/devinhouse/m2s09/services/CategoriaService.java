package tech.devinhouse.m2s09.services;

import org.springframework.stereotype.Service;
import tech.devinhouse.m2s09.models.Categoria;
import tech.devinhouse.m2s09.repositories.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService {
    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public void salvar(Categoria categoria){
        repository.save(categoria);
    }

    public List<Categoria> visualizar(){
        return (List<Categoria>) repository.findAll();
    }

    public void excluir(Categoria categoria){
        repository.delete(categoria);
    }

    public void excluirPeloId(int id){
        repository.deleteById(id);
    }
}
