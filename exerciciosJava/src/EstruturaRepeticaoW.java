import java.util.Scanner;

public class EstruturaRepeticaoW {

    public static void main(String[] args) {

        /*Estrutura de repetição que calcula quantas vezes o usuário avaliou
        * o filme da plataforma*/
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas =0;

        while (nota != -1) {

            System.out.println("Digite a sua avaliação para o filme ou -1 para encerrar.");
            nota = leitura.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota; //recebendo ele mesmo mais a nota
                totalDeNotas++;
            }else {
                System.out.println("encerrado");
            }

        }

        System.out.println("Média de avaliações  " + mediaAvaliacao/3);

    }


}
