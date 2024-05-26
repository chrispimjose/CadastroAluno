package Controller;

import Data.Database;
import Model.Aluno;

//Insere Aluno no banco de dados através dos dados do formulário
public class InsereAluno {
    //Cria uma variável para armazenar a mensagem de retorno
    static String mensagem;
    //Cria um objeto de conexão com o banco de dados
    static Database db = new Database();
    private static String _nome;
    private static String _cpf;
    private static  int _idade;
    private static String _curso;
    private static String _fase;
    
    //Método de inserção de aluno
    public static String InsAluno(Aluno aluno) {
        //Recebendo dados do objeto aluno para validação
        _nome=aluno.getNome();
        _cpf=aluno.getCpf();
        _idade=aluno.getIdade();
        _curso=aluno.getCurso();
        _fase=aluno.getFase();

        // Inicia a validação dos dados
        // Valida o tamnho do nome
        if(_nome.length()<2) {
            mensagem = "Nome deve ter pelo menos dois caracteres";
            return mensagem;
        }
        // Valida a idade
        if(_idade<=0) {
            mensagem = "Idade deve ser maior que zero";
            return mensagem;
        }      
        // Valida o CPF
        int i = _cpf.length();
        if (i > 11) {
            mensagem = "O CPF somente deve ter apenas números.";
            return mensagem;
        } else if (i <= 10){
            mensagem = "O CPF deve ter 11 dígitos sem pontos.";
            return mensagem;
        } else {            
            mensagem = ValidaCPF.validaCPF(_cpf);  
        }        
        //Cria a query de inserção de aluno
        String sql = "INSERT INTO alunos (Nome, CPF, Idade, Curso, Fase) VALUES ('"+_nome+"', '"+_cpf+"', '"+_idade+"', '"+_curso+"', '"+_fase+"')";
        //Chama o método de inserção de dados 
        Database.connection();       
        mensagem = db.InsertData(sql);
        //Retorna a mensagem de sucesso
        return mensagem;
    }

}
