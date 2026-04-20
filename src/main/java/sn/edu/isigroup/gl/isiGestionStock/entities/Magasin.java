package sn.edu.isigroup.gl.isiGestionStock.entities;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "magasin")
public class Magasin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String nom;

    private String adresse;
    private String email;
    private String telephone;
    private String ville;

    @Column(name = "code_zip")
    private String codeZip;

    private String etat;

    @JsonIgnore
    @OneToMany(mappedBy = "magasin", cascade = CascadeType.ALL)
    private List<Employe> employes;

    @JsonIgnore
    @OneToMany(mappedBy = "magasin", cascade = CascadeType.ALL)
    private List<Stock> stocks;

    @JsonIgnore
    @OneToMany(mappedBy = "magasin", cascade = CascadeType.ALL)
    private List<Commande> commandes;
}