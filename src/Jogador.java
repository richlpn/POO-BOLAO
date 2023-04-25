import java.util.Scanner;

public class Jogador extends Pessoa{
    protected String pix;

    public Jogador() {
        super();
        Scanner scanner = new Scanner(System.in);

        System.out.print("-> Digite o pix de " + this.nome + ": ");
        pix = scanner.nextLine();
    }

    @Override
    public void listarDados() {
        super.listarDados();
        System.out.println("-> Pix: " + pix);
    }
}
