package com.github.www;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigInteger;

public class Fatorial {
    public static void main(String[] args) {
        // Chama a Classe Scanner
        Scanner teclado = new Scanner(System.in);

        // Declaração de Variáveis
        int numero;
        int i = 1;
        BigInteger fatorial = BigInteger.ONE;

        // Captura a Entrada
        System.out.println();
        System.out.println("********** FATORIAL **********");
        System.out.println();
        System.out.print("Digite o número: ");
        numero = teclado.nextInt();

        // Calcula o Fatorial
        for (i = 1; i <= numero; i++){
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        // Formata o Número
        DecimalFormat df = new DecimalFormat("###,###,###");
        String resultado = df.format(fatorial);

        // Printar o Resultado na Tela
        System.out.println();
        System.out.println("********** RESULTADO **********");
        System.out.println();
        System.out.println("O Resultado é: " + resultado);
        System.out.println();
        System.out.println("********** FIM **********");
    }
}
