package tech.devinhouse.m2s09.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tech.devinhouse.m2s09.models.Produto;
@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
