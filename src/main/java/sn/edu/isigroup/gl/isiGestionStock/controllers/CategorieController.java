package sn.edu.isigroup.gl.isiGestionStock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.edu.isigroup.gl.isiGestionStock.entities.Categorie;
import sn.edu.isigroup.gl.isiGestionStock.services.CategorieService;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
@RequiredArgsConstructor
public class CategorieController {

    private final CategorieService categorieService;

    @PostMapping
    public ResponseEntity<Categorie> save(@RequestBody Categorie categorie) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(categorieService.save(categorie));
    }

    @GetMapping
    public ResponseEntity<List<Categorie>> findAll() {
        return ResponseEntity.ok(categorieService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categorie> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(categorieService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Categorie> update(@PathVariable Integer id,
                                            @RequestBody Categorie categorie) {
        return ResponseEntity.ok(categorieService.update(id, categorie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        categorieService.delete(id);
        return ResponseEntity.noContent().build();
    }
}