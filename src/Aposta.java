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
            System.out.println("-> Digite a quantidade de numeros que deseja apostar (> 0): ");
            quantApostas = scanner.nextInt();
        }


        //Adciona os N numeros apostados entre 1 e 60
        while(quantApostas > 0){
            System.out.println("-> Digite um numero entre 1 e 60 para apostar: ");
            numAposta = scanner.nextInt();

            //Numero só é valido se não estiver sido apostado e se estiver entre 1 e 60
            if(!numeros.contains(numAposta) && numAposta > 0 && numAposta <= 60){
                quantApostas--;
                numeros.add(numAposta);
            }
        }

    }
}
