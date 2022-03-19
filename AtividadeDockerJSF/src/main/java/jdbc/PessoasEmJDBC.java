package jdbc;

import dominio.Pessoa;
import connection.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PessoasEmJDBC {
    public void save(Pessoa pessoa) {

        String sql = "INSERT INTO pessoa(nome, cpf, dependente,id) VALUES (?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            // Criar uma conexão com o banco de dados
            conn = Connection.createConnectionToMySQL();

            // Criamos uma PreparedStatement, para executar uma query
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            // Adicionar os valores que são esperados pela query
            pstm.setString(1, pessoa.getNome());
            pstm.setString(2, String.valueOf(pessoa.getCpf()));
            pstm.setString(3, String.valueOf(pessoa.getDependente()));
            pstm.setLong(4, pessoa.getId());

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

    public List<Pessoa> getContatos(){

        String sql = "SELECT * FROM contatos";

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        Connection conn = null;
        PreparedStatement pstm = null;
        //Classe que vai recuperar os dados do banco. ***SELECT****
        ResultSet rset = null;

        try {
            conn = Connection.createConnectionToMySQL();

            pstm = (PreparedStatement) conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {

                Pessoa pessoa = new Pessoa();
                pessoa.setCpf(rset.getObject("CPF"));
                pessoa.setNome(rset.getString("nome"));
                pessoa.setDependente(rset.getObject("Dependente"));

                pessoas.add(pessoa);

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

        return pessoas;
    }

}
