package org.example.repository;

import jakarta.persistence.EntityManager;
import org.example.models.SolicitacaoCompra;

public class SolicitacaoCompraRepository extends JpaRepository<SolicitacaoCompra>{
    public SolicitacaoCompraRepository(EntityManager entityManager, Class<SolicitacaoCompra> entityType) {
        super(entityManager, entityType);
    }
}
