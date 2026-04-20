package sn.edu.isigroup.gl.isiGestionStock.services;

import sn.edu.isigroup.gl.isiGestionStock.entities.Stock;
import sn.edu.isigroup.gl.isiGestionStock.entities.StockId;
import java.util.List;

public interface StockService {
    Stock save(Stock stock);
    Stock findById(StockId id);
    List<Stock> findAll();
    void delete(StockId id);
}