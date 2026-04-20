package sn.edu.isigroup.gl.isiGestionStock.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.edu.isigroup.gl.isiGestionStock.entities.Categorie;
import sn.edu.isigroup.gl.isiGestionStock.repositories.CategorieRepository;
import sn.edu.isigroup.gl.isiGestionStock.services.CategorieService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CategorieServiceImpl implements CategorieService {

    private final CategorieRepository categorieRepository;

    @Override
    public Categorie save(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public Categorie findById(Integer id) {
        return categorieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Catégorie non trouvée : " + id));
    }

    @Override
    public List<Categorie> findAll() {
        return categorieRepository.findAll();
    }

    @Override
    public Categorie update(Integer id, Categorie categorie) {
        findById(id);
        categorie.setId(id);
        return categorieRepository.save(categorie);
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        categorieRepository.deleteById(id);
    }
}