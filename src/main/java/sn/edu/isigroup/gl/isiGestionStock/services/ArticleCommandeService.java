package sn.edu.isigroup.gl.isiGestionStock.services;

import sn.edu.isigroup.gl.isiGestionStock.entities.ArticleCommande;
import java.util.List;

public interface ArticleCommandeService {
    ArticleCommande save(ArticleCommande articleCommande);
    ArticleCommande findById(Integer id);
    List<ArticleCommande> findAll();
    ArticleCommande update(Integer id, ArticleCommande articleCommande);
    void delete(Integer id);
}