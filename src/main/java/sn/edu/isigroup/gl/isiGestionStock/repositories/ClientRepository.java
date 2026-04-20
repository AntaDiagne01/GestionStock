package sn.edu.isigroup.gl.isiGestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isigroup.gl.isiGestionStock.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {}
