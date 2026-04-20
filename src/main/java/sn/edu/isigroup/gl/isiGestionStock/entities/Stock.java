package sn.edu.isigroup.gl.isiGestionStock.entities;


import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "stock")
public class Stock {

    @EmbeddedId
    private StockId id;

    @ManyToOne
    @MapsId("magasinId")
    @JoinColumn(name = "magasin_id")
    private Magasin magasin;

    @ManyToOne
    @MapsId("produitId")
    @JoinColumn(name = "produit_id")
    private Produit produit;

    private Integer quantite;
}