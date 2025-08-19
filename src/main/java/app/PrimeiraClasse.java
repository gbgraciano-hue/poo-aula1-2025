package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Gabriel Castão Graciano";
        a1.idade = 28;
        a1.sexo = "Masculino";
        //a1.cpf = 45855689808;
        
        System.out.println("[A1]");
        Aluno a2 = new Aluno();
        a2.nome = "Guilherme";
        a2.idade = 33;
        System.out.println("nome = " + a1.nome);
        System.out.println("Sexo = " + a1.sexo);
        //System.out.println("CPF = " + a1.cpf);
        
        System.out.println("[A2]");
        System.out.println("nome = " + a2.nome);
        System.out.println("idade = " + a2.idade);
        //System.out.println("idade = " + a1.idade);;
        //System.out.println("Que frio está hoje em Pompéia!!!");

        System.out.println("[Chamada de método]");
        System.out.println("A1 = " + a1.getAbacaxi());
        System.out.println("A2 = " + a2.getAbacaxi());

        Aluno a3 = new Aluno("Maria" , 53);
        System.out.println("[A3] = "+ a3.getAbacaxi());

        Cliente c1 = new Cliente();
        c1.setNome("Teste");
        System.out.println("[CHAMADA DE GET]");
        System.out.println(c1.getNome());
    }
}
//atribuição por cópia 
//atribuição por espaço de memória