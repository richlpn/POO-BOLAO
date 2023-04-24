import java.util.ArrayList;

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
}
