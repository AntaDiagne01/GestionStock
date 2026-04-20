package sn.edu.isigroup.gl.isiGestionStock.services;

import sn.edu.isigroup.gl.isiGestionStock.entities.Categorie;
import java.util.List;

public interface CategorieService {
    Categorie save(Categorie categorie);
    Categorie findById(Integer id);
    List<Categorie> findAll();
    Categorie update(Integer id, Categorie categorie);
    void delete(Integer id);
}