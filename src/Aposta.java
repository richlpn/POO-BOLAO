import java.util.ArrayList;
import java.util.Scanner;

public class Aposta {
    private ArrayList<Integer> numeros;
    private Jogador organizador;
    private ArrayList<Jogador> jogadores;


    public Aposta() {
        this.numeros = new ArrayList<>();
        this.jogadores = new ArrayList<>();
    }

    public boolean vencedora(ArrayList<Integer> vencedores){
        return numeros.containsAll(vencedores);
    }

    public void inserirNumeros(){
        Scanner scanner = new Scanner(System.in);
        int quantApostas = -1, numAposta = -1;

        while(quantApostas < 0){
            System.out.print("-> Digite a quantidade de numeros que deseja apostar (> 0): ");
            quantApostas = scanner.nextInt();
        }


        //Adciona os N numeros apostados entre 1 e 60
        while(quantApostas > 0){
            System.out.print("-> Digite um numero entre 1 e 60 para apostar: ");
            numAposta = scanner.nextInt();

            //Numero só é valido se não estiver sido apostado e se estiver entre 1 e 60
            if(!numeros.contains(numAposta) && numAposta > 0 && numAposta <= 60){
                quantApostas--;
                numeros.add(numAposta);
            }
        }
    }

    private Jogador findPessoa(ArrayList<Jogador> jogadores){

        Scanner scanner = new Scanner(System.in);
        String cpf;
        System.out.print("-> Digite o CPF do jogador a ser adcionado na aposta: ");
        cpf = scanner.next();

        for (Jogador jog: jogadores) {
            if(jog.cpf.equals(cpf)) return jog;
        }

        return null;
    }
    public void inserirJogadores(ArrayList<Jogador> jogadores){
        Scanner scanner = new Scanner(System.in);
        int numJogadores = -1;

        while(numJogadores <= 0){
            System.out.print("-> Digite o numero de jogadores da aposta: ");
            numJogadores = scanner.nextInt();
        }

        for (int i = 0; i < numJogadores; i++) {
            Jogador novoJogador = findPessoa(jogadores);

            if (novoJogador == null) {
                System.out.println("-> PESSOA NÂO ENCONTRADA!");
                return;
            }
            jogadores.add(novoJogador);
        }
    }

    public void inserirOrganizador (ArrayList<Jogador> jogadores){
        Jogador organizador = null;

        for (Jogador jogador: jogadores) {
            jogador.listarDados();
        }

        while(organizador == null) {
         organizador = findPessoa(jogadores);
        }

        this.organizador = organizador;

    }

    public void listarVencedores(double premio){
        System.out.println("-> Vencedores: ");
        organizador.listarDados();
        System.out.println("-> Ganhou: " + premio * 0.1);
        premio = (premio * 0.9) / this.jogadores.size();

        for (Jogador jog: jogadores) {
            jog.listarDados();
            System.out.println("-> Ganhou: " + premio);
        }
    }
}
