import java.util.Scanner;

public class Pessoa {

    protected String nome;
    protected String cpf;
    public Pessoa() {
        Scanner input = new Scanner(System.in);
        String confirm = "S";

        while(confirm.equals("S")){
            System.out.print("-> Digite o nome da pessoa: ");
            nome = input.next();
            System.out.print("-> Digite o CPF de(a) " + nome + ": ");
            cpf = input.next();
            System.out.println("-> "+ nome +" é o nome correto? Digite S para confirmar: ");
            confirm = input.next();
        }
    }

}
