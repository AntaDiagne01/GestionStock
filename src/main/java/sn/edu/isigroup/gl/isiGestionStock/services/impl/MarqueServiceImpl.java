package sn.edu.isigroup.gl.isiGestionStock.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.edu.isigroup.gl.isiGestionStock.entities.Marque;
import sn.edu.isigroup.gl.isiGestionStock.repositories.MarqueRepository;
import sn.edu.isigroup.gl.isiGestionStock.services.MarqueService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MarqueServiceImpl implements MarqueService {

    private final MarqueRepository marqueRepository;

    @Override
    public Marque save(Marque marque) {
        return marqueRepository.save(marque);
    }

    @Override
    public Marque findById(Integer id) {
        return marqueRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Marque non trouvée : " + id));
    }

    @Override
    public List<Marque> findAll() {
        return marqueRepository.findAll();
    }

    @Override
    public Marque update(Integer id, Marque marque) {
        findById(id);
        marque.setId(id);
        return marqueRepository.save(marque);
    }

    @Override
    public void delete(Integer id) {
        findById(id);
        marqueRepository.deleteById(id);
    }
}