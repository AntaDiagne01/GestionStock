package sn.edu.isigroup.gl.isiGestionStock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.edu.isigroup.gl.isiGestionStock.entities.Produit;
import sn.edu.isigroup.gl.isiGestionStock.services.ProduitService;
import java.util.List;

@RestController
@RequestMapping("/api/produits")
@RequiredArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @PostMapping
    public ResponseEntity<Produit> save(@RequestBody Produit produit) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(produitService.save(produit));
    }

    @GetMapping
    public ResponseEntity<List<Produit>> findAll() {
        return ResponseEntity.ok(produitService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produit> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(produitService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produit> update(@PathVariable Integer id,
                                          @RequestBody Produit produit) {
        return ResponseEntity.ok(produitService.update(id, produit));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        produitService.delete(id);
        return ResponseEntity.noContent().build();
    }
}