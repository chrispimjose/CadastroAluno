package Controller;

import java.sql.SQLException;

import Data.Database;
import Model.Aluno;

//Insere Aluno no banco de dados através dos dados do formulário
public class InsereAluno {
    //Cria uma propriedade para armazenar a mensagem de retorno
    static String mensagem;
    //Cria um objeto de conexão com o banco de dados
    static Database db = new Database();
    //Define as propriedades da classe
    private static String _nome;
    private static String _cpf;
    private static  int _idade;
    private static String _curso;
    private static String _fase;
    
    //Método de inserção de aluno
    public static String InsAluno(Aluno aluno) throws SQLException {

        mensagem = ValidaAluno.valida(aluno);
        // Inicia a validação dos dados       
        if (mensagem != "Valido") {
            return mensagem;
        }

        //Recebendo dados do objeto aluno para validação
        _nome=aluno.getNome();
        _cpf=aluno.getCpf();
        _idade=aluno.getIdade();
        _curso=aluno.getCurso();
        _fase=aluno.getFase();
   
        //Cria o comando SQL de inserção de aluno
        String sql = "INSERT INTO alunos (Nome, CPF, Idade, Curso, Fase) VALUES ('"+_nome+"', '"+_cpf+"', '"+_idade+"', '"+_curso+"', '"+_fase+"')";
        try{
            //Conecta ao banco
            Database.getconnection(); 
            //Chama o método de inserção de dados       
            mensagem = db.InsertData(sql);
        } catch (Exception e) {
            mensagem = "Erro ao inserir aluno: " + e.getMessage();
        }
        //Retorna a mensagem de sucesso ou insucesso
        return mensagem;
    }
}
