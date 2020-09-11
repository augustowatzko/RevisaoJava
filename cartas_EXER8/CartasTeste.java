package cartas_EXER8;

public class CartasTeste {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        boolean embaralhando = true;

        System.out.println("> Embaralhando o monte!");
        baralho.embaralhar();
        System.out.println(">");

        while (embaralhando) {
            try {
                System.out.println("> Distribuindo " + baralho.distribuir());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("> " + e.getMessage() + " Fim de jogo!");
                embaralhando = false;
            }
        }
    }
}