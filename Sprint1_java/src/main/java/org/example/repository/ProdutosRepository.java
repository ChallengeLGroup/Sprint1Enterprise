package org.example.repository;

import jakarta.persistence.EntityManager;
import org.example.models.Fornecedor;
import org.example.models.Produtos;

import java.util.Optional;

public class ProdutosRepository extends JpaRepository<Produtos>{
    public ProdutosRepository(EntityManager entityManager, Class<Produtos> entityType) {
        super(entityManager, entityType);
    }
    public Optional<Produtos> findByNomeProdutos(String nomeProduto){
        var jpql = "SELECT a FROM Produtos a WHERE nomeProduto LIKE :nomeProduto";
        return Optional.ofNullable(entityManager.createQuery(jpql, Produtos.class)
                .setParameter("nomeProduto","%"+nomeProduto+"%")
                .getSingleResult());

    }
}
