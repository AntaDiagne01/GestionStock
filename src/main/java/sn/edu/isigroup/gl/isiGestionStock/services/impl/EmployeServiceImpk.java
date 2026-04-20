package sn.edu.isigroup.gl.isiGestionStock.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.edu.isigroup.gl.isiGestionStock.entities.Employe;
import sn.edu.isigroup.gl.isiGestionStock.repositories.EmployeRepository;
import sn.edu.isigroup.gl.isiGestionStock.services.EmployeService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpk implements EmployeService {

    private final EmployeRepository employeRepository;

    @Override
    public Employe save(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe findById(Long id) {
        return employeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employé non trouvé : " + id));
    }

    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }

    @Override
    public Employe update(Long id, Employe employe) {
        findById(id);
        employe.setId(id);
        return employeRepository.save(employe);
    }

    @Override
    public void delete(Long id) {
        findById(id);
        employeRepository.deleteById(id);
    }
}