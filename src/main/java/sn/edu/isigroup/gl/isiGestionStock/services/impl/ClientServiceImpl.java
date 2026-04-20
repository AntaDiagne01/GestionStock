package sn.edu.isigroup.gl.isiGestionStock.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sn.edu.isigroup.gl.isiGestionStock.entities.Client;
import sn.edu.isigroup.gl.isiGestionStock.repositories.ClientRepository;
import sn.edu.isigroup.gl.isiGestionStock.services.ClientService;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client findById(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client non trouvé : " + id));
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client update(Long id, Client client) {
        // Vérificaton que le client existe avqnt de update
        findById(id);
        client.setId(id);
        return clientRepository.save(client);
    }

    @Override
    public void delete(Long id) {
        findById(id);
        clientRepository.deleteById(id);
    }
}