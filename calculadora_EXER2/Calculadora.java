package calculadora_EXER2;

public class Calculadora {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        float div = num1 / num2;
        float maior;

        System.out.println("Soma"+(num1+num2));
        System.out.println("Produto "+num1 * num2);
        System.out.println("Diferença "+(num1 - num2));
        System.out.println("Divisão "+ div);

        if (num1>num2){
            maior = num1;
        }else{
            maior = num2;
        }
        System.out.println("Maior "+ maior);
    }
}