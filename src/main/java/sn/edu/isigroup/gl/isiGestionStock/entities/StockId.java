package sn.edu.isigroup.gl.isiGestionStock.entities;

import jakarta.persistence.Embeddable;
import lombok.*;
import java.io.Serializable;

// la table stock a une PK = (magasin_id et produit_id)
@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockId implements Serializable {
    private Integer magasinId;
    private Integer produitId;
}