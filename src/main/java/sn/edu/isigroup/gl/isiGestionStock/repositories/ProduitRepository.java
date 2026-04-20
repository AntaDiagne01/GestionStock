package sn.edu.isigroup.gl.isiGestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isigroup.gl.isiGestionStock.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {}