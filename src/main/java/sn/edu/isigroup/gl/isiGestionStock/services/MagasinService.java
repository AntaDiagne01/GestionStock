package sn.edu.isigroup.gl.isiGestionStock.services;

import sn.edu.isigroup.gl.isiGestionStock.entities.Magasin;
import java.util.List;

public interface MagasinService {
    Magasin save(Magasin magasin);
    Magasin findById(Integer id);
    List<Magasin> findAll();
    Magasin update(Integer id, Magasin magasin);
    void delete(Integer id);
}