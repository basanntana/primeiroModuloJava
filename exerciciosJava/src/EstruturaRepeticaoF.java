import java.util.Scanner;

public class EstruturaRepeticaoF {

    public static void main(String[] args) {


        /*Estrutura de repetição que calcula a média da avaliação dos usuários da
        * plataforma de stream*/
        Scanner leitura = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Qual a sua avaliação para o filme?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota; //recebendo ele mesmo mais a nota
        }

        System.out.println("Média de avaliações  " + mediaAvaliacao/3);



    }
}
