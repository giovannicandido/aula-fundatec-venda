package com.example.market.sellings.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductSaleId implements Serializable {

    @Column(name = "produto_id")
    private Long produtoId;

    @Column(name = "venda_id")
    private Long vendaId;
}
