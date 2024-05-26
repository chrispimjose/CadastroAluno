package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Data.Database;
import Model.Aluno;

public class AlunoController {

    //Cria a conexão com o banco de dados
    private Database db;

    public AlunoController() {
        db = new Database();
    }

    // Método para criar uma lista de alunos obtidas no banco de dados
    public ArrayList<Aluno> getAlunos() {
        // Cria o objeto lista de alunos
        //ToDo O erro está nessa linha
        ArrayList<Aluno> alunos = new ArrayList<>();
        // Gera o SQL da consulta aos dados do banco
        String sql = "SELECT ID, Nome, CPF, Idade, Curso, Fase FROM alunos";
        // Limap o resultset
        ResultSet rs = null;      

        // Processa o resultset, linha a linha e cria a lista de alunos
        try {
            rs = db.SelectData(sql);
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
        
        } finally {
            if (rs != null) {
                try {
                    rs.getStatement().close();
                    rs.close();
                } catch (SQLException e) {
                    System.out.println("Erro ao fechar ResultSet: " + e.getMessage());
                }
            }
        }
        // Retorna a lista de alunos
        return alunos;
    }

}
