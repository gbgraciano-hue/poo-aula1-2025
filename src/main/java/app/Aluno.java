package app;

public class Aluno {
    public String nome;
    public int idade;
    public String sexo;
    public int cpf;
    
    public String getAbacaxi() {
        return this.nome + " ( " + this.idade + " anos) "; //(this) Operador de desambiguação    (+) publico
    }
    public Aluno(String nome, int idade) {
        this.nome = nome; 
        this.idade = idade;

    }
    public Aluno() {

    }
}