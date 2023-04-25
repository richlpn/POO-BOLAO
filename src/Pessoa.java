import java.util.Scanner;

public class Pessoa {

    protected String nome;
    protected String cpf;
    public Pessoa() {
        Scanner input = new Scanner(System.in);
        System.out.print("-> Digite o nome da pessoa: ");
        nome = input.nextLine();
        System.out.print("-> Digite o CPF de(a) " + nome + ": ");
        cpf = input.nextLine();
    }

    public void listarDados(){
        System.out.println("-> Nome: "+ nome + " CPF: " + cpf);
    }
}
