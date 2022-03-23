package dao.intefaceCine;

import dominio.Cine;
import dominio.Evento;

import java.util.List;

public interface CineDao {
    void addCine(Cine cine);
    Cine buscarCine(Evento evento);
    void dellCine(Evento evento);
    List<Cine> listarUsuario();
    void editCliente(Cine cine);
}
