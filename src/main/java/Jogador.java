/**
 * @author Guilherme Jacichen   email:<gui_jaci@yahoo.com.br>
 */
public class Jogador {
    private int numero;
    private String nome;

    public Jogador(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return numero + " - " + nome;
    }
    
}
