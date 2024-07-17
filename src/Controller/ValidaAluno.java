package Controller;

import Model.Aluno;

public class ValidaAluno {
    // Método para validar aluno
    public static String valida(Aluno aluno) {
    String mensagem = "Valido";

    // Valida o tamnho do nome
    if(aluno.getNome().length()<2) {
        mensagem = "Nome deve ter pelo menos dois caracteres";
        return mensagem;
    }
    // Valida a idade
    if(aluno.getIdade()<=0) {
        mensagem = "Idade deve ser maior que zero";
        return mensagem;
    }  
     // Valida o CPF pelo tamanho do digitado
     int i = aluno.getCpf().length();
     if (i > 11) {
         mensagem = "O CPF somente deve ter apenas números.";
         return mensagem;
     } else if (i <= 10){
         mensagem = "O CPF deve ter 11 dígitos sem pontos.";
         return mensagem;
     }  
     
      // Valida o CPF usando o algoritmo de validação
      mensagem = ValidaCPF.validaCPF(aluno.getCpf()); 
      if (mensagem == "error1") {
            mensagem = "CPF inválido, primeiro dígito verificador inválido";
            return mensagem;
      } else if (mensagem == "error2") {
            mensagem = "CPF inválido, segundo dígito verificador inválido";
            return mensagem;
      }  else if (mensagem == "error3") {
            mensagem = "CPF inválido, sequência de números iguais";
            return mensagem;
      }
    
    return mensagem;

    }

}
