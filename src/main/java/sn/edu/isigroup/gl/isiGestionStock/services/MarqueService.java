package sn.edu.isigroup.gl.isiGestionStock.services;

import sn.edu.isigroup.gl.isiGestionStock.entities.Marque;
import java.util.List;

public interface MarqueService {
    Marque save(Marque marque);
    Marque findById(Integer id);
    List<Marque> findAll();
    Marque update(Integer id, Marque marque);
    void delete(Integer id);
}