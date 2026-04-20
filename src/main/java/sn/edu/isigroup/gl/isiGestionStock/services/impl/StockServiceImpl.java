package sn.edu.isigroup.gl.isiGestionStock.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.edu.isigroup.gl.isiGestionStock.entities.Stock;
import sn.edu.isigroup.gl.isiGestionStock.entities.StockId;
import sn.edu.isigroup.gl.isiGestionStock.repositories.StockRepository;
import sn.edu.isigroup.gl.isiGestionStock.services.StockService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

    private final StockRepository stockRepository;

    @Override
    public Stock save(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public Stock findById(StockId id) {
        return stockRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Stock non trouvé"));
    }

    @Override
    public List<Stock> findAll() {
        return stockRepository.findAll();
    }

    @Override
    public void delete(StockId id) {
        findById(id);
        stockRepository.deleteById(id);
    }
}