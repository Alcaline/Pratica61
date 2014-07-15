
import java.util.*;

/**
 * @author Guilherme Jacichen <gui_jaci@yahoo.com.br>
 */
public class Main {
    static final short SP_MAX = 20;
    
    public static void main(String[] args) {
        HashMap<String, Jogador> time1 = new HashMap<>();
        HashMap<String, Jogador> time2 = new HashMap<>();
        
        time1.put("Goleiro", new Jogador(12, "Júlio César"));
        time1.put("Zagueiro", new Jogador(4, "David Luiz"));
        time1.put("Atacante", new Jogador(10, "Neymar"));
        
        time2.put("Goleiro", new Jogador(2, "Fulano"));
        time2.put("Zagueiro", new Jogador(14, "Beltrano"));
        time2.put("Atacante", new Jogador(4, "Ciclano"));
        
        Set<String> entries = time1.keySet();
        System.out.println(
                "Posição:                    ".substring(0,SP_MAX)
                +"Time 1:                    ".substring(0,SP_MAX)
                +"Time 2:                    ".substring(0,SP_MAX)
            );
        
        for (String entry: entries) {
            System.out.println(
                    (entry+"                    ").substring(0,SP_MAX)+
                    (time1.get(entry)+"                    ").substring(0,SP_MAX)+
                    time2.get(entry)
            );
        }
    }
}
