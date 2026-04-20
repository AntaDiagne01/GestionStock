package sn.edu.isigroup.gl.isiGestionStock.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.edu.isigroup.gl.isiGestionStock.entities.Produit;
import sn.edu.isigroup.gl.isiGestionStock.repositories.ProduitRepository;
import sn.edu.isigroup.gl.isiGestionStock.services.ProduitService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;

    @Override
    public Produit save(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit findById(Integer id) {
        return produitRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produit non trouvé : " + id));
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public Produit update(Integer id, Produit produit) {
        findById(id);
        produit.setId(id);
        return produitRepository.save(produit);
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        produitRepository.deleteById(id);
    }
}