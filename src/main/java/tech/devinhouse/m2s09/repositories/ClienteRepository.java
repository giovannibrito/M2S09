package tech.devinhouse.m2s09.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.m2s09.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
}
