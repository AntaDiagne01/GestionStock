package sn.edu.isigroup.gl.isiGestionStock.services;

import sn.edu.isigroup.gl.isiGestionStock.entities.Commande;
import java.util.List;

public interface CommandeService {
    Commande save(Commande commande);
    Commande findById(Long id);
    List<Commande> findAll();
    Commande update(Long id, Commande commande);
    void delete(Long id);
}