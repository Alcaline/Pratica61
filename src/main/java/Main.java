
import java.util.*;

/**
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, Jogador> time1 = new HashMap<>();
        HashMap<String, Jogador> time2 = new HashMap<>();

        
        time1.put("Goleiro", new Jogador(12, "Júlio"));
        time1.put("Zagueiro", new Jogador(4, "David Luiz"));
        time1.put("Atacante", new Jogador(10, "Neymar"));
        
        time2.put("Goleiro", new Jogador(2, "Fulano"));
        time2.put("Zagueiro", new Jogador(14, "Beltrano"));
        time2.put("Atacante", new Jogador(4, "Ciclano"));
        
        Set<String> entries = time1.keySet();
        System.out.println("Posição:\tTime 1:\t\tTime: 2");
        for (String entry: entries) {
            System.out.printf(entry+"   \t"+time1.get(entry)+"\t"+time2.get(entry));
        }
    }
}
