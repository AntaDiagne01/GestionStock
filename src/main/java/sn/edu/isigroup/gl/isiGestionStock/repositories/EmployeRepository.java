package sn.edu.isigroup.gl.isiGestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isigroup.gl.isiGestionStock.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {}