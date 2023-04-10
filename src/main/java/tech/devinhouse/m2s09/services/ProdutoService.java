package tech.devinhouse.m2s09.services;

import org.springframework.stereotype.Service;
import tech.devinhouse.m2s09.models.Produto;
import tech.devinhouse.m2s09.repositories.ProdutoRepository;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public void salvar(Produto produto){
        repository.save(produto);
    }

    public List<Produto> visualizar(){
        return (List<Produto>) repository.findAll();
    }

    public void excluir(Produto produto){
        repository.delete(produto);
    }

    public void excluirPeloId(int id){
        repository.deleteById(id);
    }
}
