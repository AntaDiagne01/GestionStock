package sn.edu.isigroup.gl.isiGestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isigroup.gl.isiGestionStock.entities.ArticleCommande;

public interface ArticleCommandeRepository extends JpaRepository<ArticleCommande, Integer> {}