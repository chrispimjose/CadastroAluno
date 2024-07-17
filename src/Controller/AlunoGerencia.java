package Controller;

import Data.Database;
import Model.Aluno;

public class AlunoGerencia {
    //01:57:55

    static Database db = new Database();
    static String mensagem="";
    private static int _id;
    private static String _nome;
    private static String _cpf;
    private static int _idade;
    private static String _curso;
    private static String _fase;

    // Método para atualizar os dados do aluno no banco.
    public static String insereAluno(Aluno aluno){

        //Recebendo os dados do aluno
        _id=aluno.getId();
        _nome=aluno.getNome();
        _cpf=aluno.getCpf();
        _idade=aluno.getIdade();
        _curso=aluno.getCurso();
        _fase=aluno.getFase();

        //Cria o comando SQL para inserir aluno
        String sql = "UPDATE alunos SET ";
        sql = sql + "Nome='"+_nome+"', CPF='"+_cpf+"', Idade='"+_idade+"', Curso='"+_curso+"', Fase='"+_fase+"'";
        sql= sql + " WHERE ID = "+_id+"";
        try{
            // Conecta ao Banco de Dados
            Database.getconnection();
            //Chama o método de inserção de dados
            mensagem = db.UpdateData(sql);
        } catch (Exception e) {
            mensagem = "Erro ao Atualizar aluno: " + e.getMessage();
            System.out.println(mensagem);
        }
        // Retorna mensagem de sucesso ou insucesso.
        return mensagem;
    }


    // Método para deletar os dados do aluno no banco.
    public static String apagaAluno(int id) {


        //Cria o comando SQL para apagar aluno
        String sql = "DELETE FROM alunos WHERE ( ID = '"+ id +"')";
        try{
            Database.getconnection();
            mensagem = db.DeleteData(sql);
        } catch (Exception e) {
            mensagem = "Erro ao apagar aluno: " + e.getMessage();
            System.out.println(mensagem);
        }
        // Retorna mensagem de sucesso ou insucesso.
        return mensagem;
    }

}
