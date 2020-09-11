package fatura_EXER4;

import java.util.Scanner;

public class Fatura {
    public static void main(String[] args) {
        String desc;
        int qtd, preco, total, cod;

         cod = Integer.parseInt(args[0]);
         qtd = Integer.parseInt(args[1]);
         preco = Integer.parseInt(args[2]);
         desc = args[3];

        System.out.println("Codigo: "+cod);
        System.out.println("Quantidade: "+qtd);
        System.out.println("Descricao: "+desc);
        System.out.println("Preco unitário: "+preco);
        System.out.println("Total:"+ (qtd * preco));
    }
}

