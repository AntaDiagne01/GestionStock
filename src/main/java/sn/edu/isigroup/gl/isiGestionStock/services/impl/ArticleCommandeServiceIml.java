package sn.edu.isigroup.gl.isiGestionStock.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.edu.isigroup.gl.isiGestionStock.entities.ArticleCommande;
import sn.edu.isigroup.gl.isiGestionStock.repositories.ArticleCommandeRepository;
import sn.edu.isigroup.gl.isiGestionStock.services.ArticleCommandeService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleCommandeServiceIml implements ArticleCommandeService {

    private final ArticleCommandeRepository articleCommandeRepository;

    @Override
    public ArticleCommande save(ArticleCommande articleCommande) {
        return articleCommandeRepository.save(articleCommande);
    }

    @Override
    public ArticleCommande findById(Integer id) {
        return articleCommandeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Article commande non trouvé : " + id));
    }

    @Override
    public List<ArticleCommande> findAll() {
        return articleCommandeRepository.findAll();
    }

    @Override
    public ArticleCommande update(Integer id, ArticleCommande articleCommande) {
        findById(id);
        articleCommande.setId(id);
        return articleCommandeRepository.save(articleCommande);
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        articleCommandeRepository.deleteById(id);
    }
}