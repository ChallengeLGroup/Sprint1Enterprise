package org.example.repository;

import jakarta.persistence.EntityManager;
import org.example.models.Endereco;

import java.util.Optional;

public class EnderecoRepository extends JpaRepository<Endereco>{

    public EnderecoRepository(EntityManager entityManager, Class<Endereco> entityType) {
        super(entityManager, entityType);
    }


    public Optional<Endereco> findByCep(String cep){
        var jpql = "SELECT a FROM Endereco a WHERE cep = :cep";
        return Optional.ofNullable(entityManager.createQuery(jpql, Endereco.class)
                        .setParameter("cep",cep)
                .getSingleResult());

    }
}
