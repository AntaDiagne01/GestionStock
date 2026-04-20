package sn.edu.isigroup.gl.isiGestionStock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.edu.isigroup.gl.isiGestionStock.entities.Stock;
import sn.edu.isigroup.gl.isiGestionStock.entities.StockId;
import sn.edu.isigroup.gl.isiGestionStock.services.StockService;
import java.util.List;

@RestController
@RequestMapping("/api/stocks")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @PostMapping
    public ResponseEntity<Stock> save(@RequestBody Stock stock) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(stockService.save(stock));
    }

    @GetMapping
    public ResponseEntity<List<Stock>> findAll() {
        return ResponseEntity.ok(stockService.findAll());
    }

    @GetMapping("/{magasinId}/{produitId}")
    public ResponseEntity<Stock> findById(@PathVariable Integer magasinId,
                                          @PathVariable Integer produitId) {
        return ResponseEntity.ok(stockService.findById(new StockId(magasinId, produitId)));
    }

    @DeleteMapping("/{magasinId}/{produitId}")
    public ResponseEntity<Void> delete(@PathVariable Integer magasinId,
                                       @PathVariable Integer produitId) {
        stockService.delete(new StockId(magasinId, produitId));
        return ResponseEntity.noContent().build();
    }
}