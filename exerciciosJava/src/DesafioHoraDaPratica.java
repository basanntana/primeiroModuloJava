public class DesafioHoraDaPratica {

    public static void main(String[] args) {

        /*Crie um programa que realize a média de duas notas decimais e exiba o resultado.*/

        double primeiraNota = 9.8;
        double segundaNota = 7.9;
        double media = (primeiraNota + segundaNota) / 2;

        System.out.println("A média é: " + media);

        /*Declare uma variável do tipo double e uma variável do tipo int.
         Faça o casting da variável double para int e imprima o resultado.*/

        double numeroDouble = 15.7;
        int numeroInteiro = (int) numeroDouble;
        System.out.println("Casting de double para int: " + numeroInteiro);

        /*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra).
        Atribua valores a essas variáveis e concatene-as em uma mensagem.*/


        char letra = 'B';
        String palavra = "Barbara";

        System.out.println("Olá "+ palavra + ". Seu nome começa com a letra "+ letra);


        /*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
         Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.*/

         double precoProduto = 250.99;
         int quantidade = 5;
         int mult;

         mult = (int)precoProduto * quantidade;

        System.out.println("O valor total da compra é R$" +mult);

        /*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
         Considere que o valor de 1 dólar é equivalente a 4.94 reais.
         Realize a conversão do valor em dólares para reais e imprima o resultado formatado.*/

        double valorEmDolares = 100.50;
        double taxaDeConversao = 4.94;

        double valorEmReais = valorEmDolares * taxaDeConversao;

        System.out.println("O valor em reais é: " + valorEmReais);


        /*Declare uma variável do tipo double precoOriginal.
        Atribua um valor em reais a essa variável, representando o preço original de um produto.
        Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de
        desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.*/

        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);






    }
}

