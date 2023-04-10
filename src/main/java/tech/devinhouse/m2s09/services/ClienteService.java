package tech.devinhouse.m2s09.services;

import org.springframework.stereotype.Service;
import tech.devinhouse.m2s09.models.Cliente;
import tech.devinhouse.m2s09.repositories.ClienteRepository;

import java.util.List;

@Service
public class ClienteService {
    private final ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void salvar(Cliente cliente){
        repository.save(cliente);
    }

    public List<Cliente> visualizar(){
        return (List<Cliente>) repository.findAll();
    }

    public void excluir(Cliente cliente){
        repository.delete(cliente);
    }

    public void excluirPeloId(int id){
        repository.deleteById(id);
    }
}
