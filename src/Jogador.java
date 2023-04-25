import java.util.Scanner;

public class Jogador extends Pessoa{
    protected String pix;

    public Jogador() {
        super();
        Scanner scanner = new Scanner(System.in);
        String valido = "";

        while(!valido.equals("sim")){
            System.out.print("->Digite o pix de " + this.nome + ": ");
            pix = scanner.next();
            System.out.print("-> Digite sim para confirmar ou qualquer coisa para tentar novamente: ");
            valido = scanner.next();
        }

    }

    @Override
    public void listarDados() {
        super.listarDados();
        System.out.println("-> Pix: " + pix);
    }
}
