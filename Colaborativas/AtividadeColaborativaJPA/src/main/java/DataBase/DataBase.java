package DataBase;
import dominio.Banda;

import java.sql.Array;
import conexao.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class DataBase {
    private List<Banda> bandas;

    public void save(Banda banda) {

        String sql = "INSERT INTO pessoa(id, Local, Fantasia,integrantes) VALUES (?, ?, ?, ?)";

        connection conn = null;
        Connection conec = null;
        PreparedStatement pstm = null;

        try {
            // Criar uma conexão com o banco de dados
            conn = (connection) connection.createConnectionToMySQL();

            // Criamos uma PreparedStatement, para executar uma query
            pstm = (PreparedStatement) conec.prepareStatement(sql);
            // Adicionar os valores que são esperados pela query
            pstm.setString(1, banda.getLocalDeOrigem());
            pstm.setString(2, banda.getNomeFantasia());
            pstm.setLong(3, banda.getId());
            pstm.setArray(4, (Array) banda.getIntegrantes());

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

    public List<Banda> getContatos(){

        String sql = "SELECT * FROM contatos";

        List<Banda> banda = new ArrayList<Banda>();

        connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco. ***SELECT****
        ResultSet rset = null;

        try {
            conn = (connection) connection.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {

                Banda bandas = new Banda();
                bandas.setIntegrantes(

                );
                bandas.setNomeFantasia(rset.getNString("Fantasia"));
                bandas.setLocalDeOrigem(rset.getNString("Local"));
                bandas.setId(rset.getByte(1
                ));

                banda.add(bandas);

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

        return bandas;
    }

}
