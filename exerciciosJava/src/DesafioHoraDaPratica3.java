import java.util.Scanner;

public class DesafioHoraDaPratica3 {

    public static void main(String[] args) {

        /*Crie um menu que oferece duas opções ao usuário:
         "1. Calcular área do quadrado" e "2. Calcular área do círculo".
        Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.*/

        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        /*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.*/

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        /*Crie um programa que solicite ao usuário a entrada de um número inteiro.
         Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.*/

        System.out.print("Digite um número inteiro: ");
        int numeroInt = scanner.nextInt();

        if (numeroInt % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        /*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/

        System.out.print("Digite um número: ");
        int numeroF = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroF; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroF + " é: " + fatorial);
    }

}

