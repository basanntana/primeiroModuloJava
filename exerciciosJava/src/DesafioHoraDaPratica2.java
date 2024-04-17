import java.util.Scanner;

public class DesafioHoraDaPratica2 {

    public static void main(String[] args) {

        /*Crie um programa que solicite ao usuário digitar um número.
         Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".*/

        Scanner leitura = new Scanner(System.in);

        System.out.println("Escolha um número:  ");
        int numeroEscolhido = leitura.nextInt();

        if(numeroEscolhido > 0){
            System.out.println("Você escolheu um número positivo. ");
        } else{
            System.out.println("Você escolheu um número negativo. ");
        }


      /*Peça ao usuário para inserir dois números inteiros.
      Compare os números e imprima uma mensagem indicando se são iguais,
       diferentes, o primeiro é maior ou o segundo é maior.*/

        System.out.println("Digite o primeiro número");
        int numero1 = leitura.nextInt();

        System.out.println("Digite o segundo número");
        int numero2 = leitura.nextInt();

        if(numero1 == numero2){
            System.out.println("Os números são iguais");
        } else if (numero1 > numero2) {
            System.out.println("O primeiro número é maior");
        }  else {
            System.out.println("O segundo número é maior");
        }
    }
}
