package org.example.repository;

import jakarta.persistence.EntityManager;
import org.example.models.Endereco;
import org.example.models.Fornecedor;

import java.util.Optional;

public class ForncedorRepository extends JpaRepository<Fornecedor> {
    public ForncedorRepository(EntityManager entityManager, Class<Fornecedor> entityType) {
        super(entityManager, entityType);
    }

    public Optional<Fornecedor> findByCnpj(String cnpj){
        var jpql = "SELECT a FROM Forncedor a WHERE cnpj = :cnpj";
        return Optional.ofNullable(entityManager.createQuery(jpql, Fornecedor.class)
                .setParameter("cnpj",cnpj)
                .getSingleResult());

    }
}
