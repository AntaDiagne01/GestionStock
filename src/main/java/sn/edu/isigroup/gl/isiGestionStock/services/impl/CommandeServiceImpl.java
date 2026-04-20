package sn.edu.isigroup.gl.isiGestionStock.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.edu.isigroup.gl.isiGestionStock.entities.Commande;
import sn.edu.isigroup.gl.isiGestionStock.repositories.CommandeRepository;
import sn.edu.isigroup.gl.isiGestionStock.services.CommandeService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommandeServiceImpl implements CommandeService {

    private final CommandeRepository commandeRepository;

    @Override
    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande findById(Long id) {
        return commandeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Commande non trouvée : " + id));
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande update(Long id, Commande commande) {
        findById(id);
        commande.setId(id);
        return commandeRepository.save(commande);
    }

    @Override
    public void delete(Long id) {
        findById(id);
        commandeRepository.deleteById(id);
    }
}
