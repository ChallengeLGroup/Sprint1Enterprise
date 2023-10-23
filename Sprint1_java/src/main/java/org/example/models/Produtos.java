package org.example.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="produtos")
public class Produtos {
    @Id
    @Column(length = 50)
    private String sku;
    private String nomeProduto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="codigoSolicitacao")
    private SolicitacaoCompra solicitacaoCompra;



}
