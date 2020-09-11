package geometria_EXER6;

public class GeometriaTeste {

    public static void main(String[] args) {
        double raio =  Double.parseDouble(args[0]);
        double comprimento = Double.parseDouble(args[1]);
        double largura = Double.parseDouble(args[2]);
        double lado = Double.parseDouble(args[3]);

        Circulo c = new Circulo(raio);
        Retangulo r = new Retangulo(comprimento, largura);
        Quadrado q = new Quadrado(lado);

        System.out.println("> Testes realizados");
        System.out.println(">");
        System.out.println("> Área Círculo: " + c.getArea());
        System.out.println("> Perímetro Círculo: " + c.getPerimetro());
        System.out.println("> Área Retângulo: " + r.getArea());
        System.out.println("> Perímetro Retângulo: " + r.getPerimetro());
        System.out.println("> Área Quadrado: " + q.getArea());
        System.out.println("> Perímetro Quadrado: " + q.getPerimetro());

    }
}