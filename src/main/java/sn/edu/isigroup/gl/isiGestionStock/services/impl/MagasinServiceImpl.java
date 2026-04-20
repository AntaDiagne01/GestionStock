package sn.edu.isigroup.gl.isiGestionStock.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.edu.isigroup.gl.isiGestionStock.entities.Magasin;
import sn.edu.isigroup.gl.isiGestionStock.repositories.MagasinRepository;
import sn.edu.isigroup.gl.isiGestionStock.services.MagasinService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MagasinServiceImpl implements MagasinService {

    private final MagasinRepository magasinRepository;

    @Override
    public Magasin save(Magasin magasin) {
        return magasinRepository.save(magasin);
    }

    @Override
    public Magasin findById(Integer id) {
        return magasinRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Magasin non trouvé : " + id));
    }

    @Override
    public List<Magasin> findAll() {
        return magasinRepository.findAll();
    }

    @Override
    public Magasin update(Integer id, Magasin magasin) {
        findById(id);
        magasin.setId(id);
        return magasinRepository.save(magasin);
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        magasinRepository.deleteById(id);
    }
}