package Model;

public class Aluno {
    // Definindo as propriedades ou atributos da classe
    private int id;
    private String nome;
    private String cpf;
    private int idade;
    private String curso;
    private String fase;
    
    //Criando o construtor da classe
    public Aluno(){        
    }
    //Construtor com parâmentros
    public Aluno (int id, String nome, String CPF, int idade, String curso, String fase){
        // Inicializando as propriedades
        this.id = id;
        this.nome = nome;
        this.cpf = CPF;
        this.idade = idade;
        this.curso = curso;
        this.fase = fase;
    }

    //Criando os métodos de acesso Get e Set   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    public String getFase(){
        return fase;
    }
    public void setFase(String fase){
        this.fase = fase;
    }   

}
