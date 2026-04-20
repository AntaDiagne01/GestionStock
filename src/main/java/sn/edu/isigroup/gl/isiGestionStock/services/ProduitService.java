package sn.edu.isigroup.gl.isiGestionStock.services;

import sn.edu.isigroup.gl.isiGestionStock.entities.Produit;
import java.util.List;

public interface ProduitService {
    Produit save(Produit produit);
    Produit findById(Integer id);
    List<Produit> findAll();
    Produit update(Integer id, Produit produit);
    void delete(Integer id);
}