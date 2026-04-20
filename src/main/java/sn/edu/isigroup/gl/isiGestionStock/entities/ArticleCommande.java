package sn.edu.isigroup.gl.isiGestionStock.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "article_commande")
public class ArticleCommande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "prix_depart", nullable = false)
    private Integer prixDepart;

    @Column(nullable = false)
    private Integer quantite;

    @Column(name = "remise_decimal")
    private Integer remiseDecimal;

    @ManyToOne
    @JoinColumn(name = "produit_id", nullable = false)
    private Produit produit;


    @ManyToOne
    @JoinColumn(name = "commande_id", nullable = false)
    private Commande commande;
}