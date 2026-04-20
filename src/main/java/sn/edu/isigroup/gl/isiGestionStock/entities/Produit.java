package sn.edu.isigroup.gl.isiGestionStock.entities;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nom;

    @Column(name = "annee_model")
    private Integer anneeModel;

    @Column(name = "prix_depart", nullable = false)
    private Integer prixDepart;

    @ManyToOne
    @JoinColumn(name = "categorie_id", nullable = false)
    private Categorie categorie;

    @ManyToOne
    @JoinColumn(name = "marque_id", nullable = false)
    private Marque marque;

    @JsonIgnore
    @OneToMany(mappedBy = "produit")
    private List<Stock> stocks;

    @JsonIgnore
    @OneToMany(mappedBy = "produit")
    private List<ArticleCommande> articleCommandes;
}