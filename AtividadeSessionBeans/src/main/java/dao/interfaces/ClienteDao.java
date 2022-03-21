package dao.interfaces;

import dominio.Cliente;

import java.util.List;

public interface ClienteDao {
    void addCliente(Cliente cliente);
    Cliente buscarCliente(String email);
    void dellCliente(String email);
    List<Cliente> listarUsuario();
    void editCliente(Cliente cliente);
}
