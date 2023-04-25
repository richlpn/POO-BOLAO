import java.util.ArrayList;
import java.util.Scanner;

public class Bolao {
    private ArrayList<Aposta> apostas;
    private ArrayList<Jogador> jogadores;

    public Bolao() {
        apostas = new ArrayList<>();
        jogadores = new ArrayList<>();
    }

    public void cadastrarJogador(){
        jogadores.add(new Jogador());
    }

    public void cadastrarAposta(){
        Aposta aposta = new Aposta();

        aposta.inserirOrganizador(this.jogadores);
        aposta.inserirJogadores(this.jogadores);

        apostas.add(aposta);
    }

    private ArrayList<Aposta> vencedoras(ArrayList<Integer> sorteados){
        ArrayList<Aposta> apostasVencedoras = new ArrayList<>();

        for (Aposta aposta : apostas) {
            if(aposta.vencedora(sorteados)) apostasVencedoras.add(aposta);
        }

        return apostasVencedoras;

    }

    public void inserirSorteio(){
        ArrayList<Integer> sorteados = new ArrayList<>();
        ArrayList<Aposta> vencedores;
        double premioTotal = 0;
        int numSorteado = -1, cont = 1;
        Scanner scanner = new Scanner(System.in);

        while (cont < 7) {
            System.out.print("-> Digite o " + cont + "º numero: ");
            numSorteado = scanner.nextInt();

            if(!sorteados.contains(numSorteado)) {
                sorteados.add(scanner.nextInt());
                cont++;
            }
        }

        while(premioTotal <= 0) {
            System.out.print("-> Digite o valor total do prêmio: ");
            premioTotal = scanner.nextDouble();
        }

        vencedores = vencedoras(sorteados);
        if(vencedores.size() == 0 ){
            System.out.println("-> Não houver vencederes!");
            return;
        }
        premioTotal = premioTotal / vencedores.size();

        for (Aposta aposta: vencedores) {
            aposta.listarVencedores(premioTotal);
        }

    }
}
