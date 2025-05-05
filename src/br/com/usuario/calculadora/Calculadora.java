package src.br.com.usuario.calculadora;


import java.util.Scanner;

public class Calculadora {

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha a operação (1: Soma, 2: Subtração, 3: Multiplicação, 4: Divisão): ");
        int operacao = entrada.nextInt();

        System.out.println("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = somar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                resultado = dividir(num1, num2);
                if (!Double.isNaN(resultado)) {
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operação inválida.");
        }

        entrada.close();
    }
}

