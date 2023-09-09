package com.github.com;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigInteger;

public class Fatorial {
    public static void main(String[] args) {
        // Chama a Classe Scanner
        Scanner teclado = new Scanner(System.in);

        // Declaração de Variáveis
        long numero;
        int i = 1;
        BigInteger fatorial = BigInteger.ONE;

        // Captura a Entrada
        System.out.println();
        System.out.println("********** COMBINAÇÃO **********");
        System.out.println();
        System.out.print("Digite um Número: ");
        numero = teclado.nextLong();

        // Calcula o Fatorial
        for (i = 1; i <= numero; i++){
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        // Formata o Numero
        DecimalFormat df = new DecimalFormat("###,###,###");
        String resultadoFormatado = df.format(fatorial);

        // Printa o Resultado na Tela
        System.out.println();
        System.out.println("********** RESULTADO **********");
        System.out.println();
        System.out.println("O Resultado é: " + resultadoFormatado);
        System.out.println();
        System.out.println("********** PAULO HENRIQUE AZEVEDO DO NASCIMENTO **********");

    }
}
