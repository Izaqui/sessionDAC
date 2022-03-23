package dataBase;
import dominio.Cine;
import dominio.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class DataBase {
    public void save(Cine cine) {

        String sql = "INSERT INTO pessoa(nome, cpf, dependente,id) VALUES (?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            // Criar uma conexão com o banco de dados
            conn = Connection.createConnectionToMySQL();

            // Criamos uma PreparedStatement, para executar uma query
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            // Adicionar os valores que são esperados pela query
            pstm.setString(1, cine.getFilme());
            pstm.setString(2, String.valueOf(cine.getAtor()));
            pstm.setString(3, cine.getEvento());

            // Executar a query
            pstm.execute();

            System.out.println("salvo com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // Fechar as conexões
            try {
                if (pstm != null) {
                    pstm.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Cine> getContatos(){

        String sql = "SELECT * FROM contatos";

        List<Cine> cines = new ArrayList<Cine>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco. ***SELECT****
        ResultSet rset = null;

        try {
            conn = Connection.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {

                Cine cine = new Cine();
                cine.setFilme(rset.getObject());
                cine.setAtor(rset.getObject());
                cine.setEvento(rset.getObject());

                cines.add(cine);

            }
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(rset!=null) {
                    rset.close();
                }

                if(pstm!=null) {
                    pstm.close();
                }

                if(conn!=null) {
                    conn.close();
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }

        return cines;
    }

}
