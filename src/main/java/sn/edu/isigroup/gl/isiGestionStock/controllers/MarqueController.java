package sn.edu.isigroup.gl.isiGestionStock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.edu.isigroup.gl.isiGestionStock.entities.Marque;
import sn.edu.isigroup.gl.isiGestionStock.services.MarqueService;
import java.util.List;

@RestController
@RequestMapping("/api/marques")
@RequiredArgsConstructor
public class MarqueController {

    private final MarqueService marqueService;

    @PostMapping
    public ResponseEntity<Marque> save(@RequestBody Marque marque) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(marqueService.save(marque));
    }

    @GetMapping
    public ResponseEntity<List<Marque>> findAll() {
        return ResponseEntity.ok(marqueService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marque> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(marqueService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Marque> update(@PathVariable Integer id,
                                         @RequestBody Marque marque) {
        return ResponseEntity.ok(marqueService.update(id, marque));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        marqueService.delete(id);
        return ResponseEntity.noContent().build();
    }
}