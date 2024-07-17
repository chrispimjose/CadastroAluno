package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Data.Database;
import Model.Aluno;

public class AlunoController {

    public AlunoController() {    
    }

    // Método para criar uma lista de alunos obtidas no banco de dados
    public List<Aluno> getAlunos() throws SQLException {
        // Conecta ao banco
         //Conecta ao banco
         Database.getconnection();
        // Cria o objeto lista de alunos
        //ToDo O erro está nessa linha
        List<Aluno> alunos = new ArrayList<Aluno>();
        // Gera o SQL da consulta aos dados do banco
        String sql = "SELECT ID, Nome, CPF, Idade, Curso, Fase FROM alunos";
        // Cria o reultset para armazenar o resultado da consulta
        ResultSet rs = null;      

        // Processa o resultset, linha a linha e cria a lista de alunos
        try {
            rs = Database.SelectData(sql);
            while (rs.next()) {
                //Varre o resultset
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                int idade = rs.getInt("idade");
                String curso = rs.getString("curso");
                String fase = rs.getString("fase");
                Aluno aluno = new Aluno(id, nome, cpf, idade, curso, fase);
                // Cria a lista de alunos
                alunos.add(aluno);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao processar ResultSet: " + e.getMessage());
            Database.CloseDatabase();
        
        } finally {
            if (rs != null) {
                try {
                    rs.getStatement().close();
                    rs.close();
                    Database.CloseDatabase();
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar ResultSet: " + e.getMessage());
                }
            }
        }
        // Retorna a lista de alunos
        return alunos;
    }

}
