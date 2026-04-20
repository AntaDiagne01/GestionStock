package sn.edu.isigroup.gl.isiGestionStock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.edu.isigroup.gl.isiGestionStock.entities.Magasin;
import sn.edu.isigroup.gl.isiGestionStock.services.MagasinService;
import java.util.List;

@RestController
@RequestMapping("/api/magasins")
@RequiredArgsConstructor
public class MagasinController {

    private final MagasinService magasinService;

    @PostMapping
    public ResponseEntity<Magasin> save(@RequestBody Magasin magasin) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(magasinService.save(magasin));
    }

    @GetMapping
    public ResponseEntity<List<Magasin>> findAll() {
        return ResponseEntity.ok(magasinService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Magasin> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(magasinService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Magasin> update(@PathVariable Integer id,
                                          @RequestBody Magasin magasin) {
        return ResponseEntity.ok(magasinService.update(id, magasin));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        magasinService.delete(id);
        return ResponseEntity.noContent().build();
    }
}