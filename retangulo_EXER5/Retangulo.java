package retangulo_EXER5;

public class Retangulo {

    private double comprimento;
    private double largura;

    public Retangulo() {
        comprimento = 1;
        largura = 1;
    }

    /**
     * @return the comprimento
     */
    public double getComprimento() {
        return comprimento;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(double comprimento) {
        if (comprimento <= 0) {
            throw new IllegalArgumentException();
        }
        this.comprimento = comprimento;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        if (largura <= 0) {
            throw new IllegalArgumentException();
        }
        this.largura = largura;
    }

    public double perimetro() {
        return 2 * comprimento + 2 * largura;
    }

    public double area() {
        return comprimento * largura;
    }
}