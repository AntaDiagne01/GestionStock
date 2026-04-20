package sn.edu.isigroup.gl.isiGestionStock.services;

import sn.edu.isigroup.gl.isiGestionStock.entities.Client;
import java.util.List;

public interface ClientService {
    Client save(Client client);
    Client findById(Long id);
    List<Client> findAll();
    Client update(Long id, Client client);
    void delete(Long id);
}