package tech.devinhouse.m2s09.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.m2s09.models.Categoria;

@Repository
public interface CategoriaRepository extends CrudRepository<Categoria,Integer> {
}
