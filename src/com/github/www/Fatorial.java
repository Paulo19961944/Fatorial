package com.github.www;
import java.util.Scanner;
import java.math.BigInteger;
import java.text.DecimalFormat;

public class Fatorial {
    public static void main(String[] args) {
        // Chama a Classe Scanner
        Scanner teclado = new Scanner(System.in);

        // Captura o número
        System.out.println();
        System.out.println("********** RESULTADO **********");
        System.out.println();
        System.out.print("Digite um número (entre 1 e 100): ");
        long numero = teclado.nextLong();

        // Verifica se o número está dentro do intervalo permitido
        if (numero >= 1 && numero <= 100) {
            // Calcula o Fatorial
            BigInteger fatorial = calcularFatorial(BigInteger.valueOf(numero));

            // Formata o Número
            DecimalFormat df = new DecimalFormat("###,###,###");
            String fatorialFormatado = df.format(fatorial);

            // Printa o Resultado
            System.out.println();
            System.out.println("********** RESULTADO **********");
            System.out.println();
            System.out.println("O Resultado é: " + fatorialFormatado);
            System.out.println();
            System.out.println("********** PAULO HENRIQUE AZEVEDO DO NASCIMENTO **********");
        } else {
            System.out.println("Número fora do intervalo permitido (1 a 100).");
        }
    }

    public static BigInteger calcularFatorial(BigInteger n) {
        BigInteger resultado = BigInteger.ONE;
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            resultado = resultado.multiply(i);
        }
        return resultado;
    }
}
