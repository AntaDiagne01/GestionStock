package sn.edu.isigroup.gl.isiGestionStock.entities;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "employe")
public class Employe extends Personne {

    @ManyToOne
    @JoinColumn(name = "magasin_id", nullable = false)
    private Magasin magasin;

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = true)
    private Employe manager;

    @JsonIgnore
    @OneToMany(mappedBy = "manager")
    private List<Employe> subordonnes;

    @JsonIgnore
    @OneToMany(mappedBy = "vendeur")
    private List<Commande> commandes;
}