package sn.edu.isigroup.gl.isiGestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.edu.isigroup.gl.isiGestionStock.entities.Stock;
import sn.edu.isigroup.gl.isiGestionStock.entities.StockId;

public interface StockRepository extends JpaRepository<Stock, StockId> {}