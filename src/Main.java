import java.util.Scanner;

public class Main {

    public static int menu(){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        System.out.println("1. Cadastrar jogador\n2. Cadastrar aposta\n3. Inserir sorteio e listar vencedores\n4. Sair");
        while(opcao <=0 || opcao > 4){
            System.out.print("-> Digite uma ação valida: ");
            opcao = scanner.nextInt();
        }
        return opcao;
    }
    public static void main(String[] args) {
        Bolao bolao = new Bolao();
        boolean sair = false;
        int opcao = 0;

        while(!sair){
            opcao = menu();

            switch (opcao) {
                case 1 -> bolao.cadastrarJogador();
                case 2 -> bolao.cadastrarAposta();
                case 3 -> bolao.inserirSorteio();
                case 4 -> sair = true;
            }
        }

    }
}