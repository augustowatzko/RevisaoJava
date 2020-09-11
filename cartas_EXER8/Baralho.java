package cartas_EXER8;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Baralho {

    private List<Carta> monte;
    private int cartaAtual;
    public static final int TOTAL_DE_CARTAS = 52;
    public static final String VALORES[] = {
            "Às", "Dois", "Três", "Quatro", "Cinco", "Seis",
            "Sete", "Oito", "Nove", "Dez", "Valete", "Dama", "Rei"
    };
    public static final String NAIPES[] = {
            "Paus", "Ouros", "Copas", "Espadas"
    };

    public Baralho() {
        // inicializa o monte
        monte = new ArrayList<>();
        cartaAtual = 0;

        // Preenche monte
        for (String naipe : NAIPES) {
            for (String valor : VALORES) {
                monte.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(monte);
        cartaAtual = 0;
    }

    public Carta distribuir() {
        if (cartaAtual <  TOTAL_DE_CARTAS) {
            return monte.get(cartaAtual++);
        } else {
            throw new ArrayIndexOutOfBoundsException("Nenhuma carta no baralho!");
        }
    }
}
