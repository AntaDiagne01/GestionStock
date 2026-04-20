package sn.edu.isigroup.gl.isiGestionStock.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.edu.isigroup.gl.isiGestionStock.entities.Employe;
import sn.edu.isigroup.gl.isiGestionStock.services.EmployeService;
import java.util.List;

@RestController
@RequestMapping("/api/employes")
@RequiredArgsConstructor
public class EmployeController {

    private final EmployeService employeService;

    @PostMapping
    public ResponseEntity<Employe> save(@RequestBody Employe employe) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(employeService.save(employe));
    }

    @GetMapping
    public ResponseEntity<List<Employe>> findAll() {
        return ResponseEntity.ok(employeService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employe> findById(@PathVariable Long id) {
        return ResponseEntity.ok(employeService.findById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employe> update(@PathVariable Long id,
                                          @RequestBody Employe employe) {
        return ResponseEntity.ok(employeService.update(id, employe));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        employeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}