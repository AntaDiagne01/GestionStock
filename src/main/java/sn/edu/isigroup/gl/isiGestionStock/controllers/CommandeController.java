package sn.edu.isigroup.gl.isiGestionStock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.edu.isigroup.gl.isiGestionStock.entities.Commande;
import sn.edu.isigroup.gl.isiGestionStock.services.CommandeService;
import java.util.List;

@RestController
@RequestMapping("/api/commandes")
@RequiredArgsConstructor
public class CommandeController {

    private final CommandeService commandeService;

    @PostMapping
    public ResponseEntity<Commande> save(@RequestBody Commande commande) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(commandeService.save(commande));
    }

    @GetMapping
    public ResponseEntity<List<Commande>> findAll() {
        return ResponseEntity.ok(commandeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Commande> findById(@PathVariable Long id) {
        return ResponseEntity.ok(commandeService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Commande> update(@PathVariable Long id,
                                           @RequestBody Commande commande) {
        return ResponseEntity.ok(commandeService.update(id, commande));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        commandeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}