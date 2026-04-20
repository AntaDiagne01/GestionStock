package sn.edu.isigroup.gl.isiGestionStock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.edu.isigroup.gl.isiGestionStock.entities.ArticleCommande;
import sn.edu.isigroup.gl.isiGestionStock.services.ArticleCommandeService;
import java.util.List;

@RestController
@RequestMapping("/api/articles-commande")
@RequiredArgsConstructor
public class ArticleCommandeController {

    private final ArticleCommandeService articleCommandeService;

    @PostMapping
    public ResponseEntity<ArticleCommande> save(@RequestBody ArticleCommande articleCommande) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(articleCommandeService.save(articleCommande));
    }

    @GetMapping
    public ResponseEntity<List<ArticleCommande>> findAll() {
        return ResponseEntity.ok(articleCommandeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ArticleCommande> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(articleCommandeService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ArticleCommande> update(@PathVariable Integer id,
                                                  @RequestBody ArticleCommande articleCommande) {
        return ResponseEntity.ok(articleCommandeService.update(id, articleCommande));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        articleCommandeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}