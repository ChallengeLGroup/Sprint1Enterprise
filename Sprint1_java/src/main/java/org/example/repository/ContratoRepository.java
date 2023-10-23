package org.example.repository;

import jakarta.persistence.EntityManager;

public class ContratoRepository extends JpaRepository{
    public ContratoRepository(EntityManager entityManager, Class entityType) {
        super(entityManager, entityType);
    }
}
