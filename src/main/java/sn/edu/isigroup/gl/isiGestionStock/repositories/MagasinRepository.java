package sn.edu.isigroup.gl.isiGestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isigroup.gl.isiGestionStock.entities.Magasin;

public interface MagasinRepository extends JpaRepository<Magasin, Integer> {}