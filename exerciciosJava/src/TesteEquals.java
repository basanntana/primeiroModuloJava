public class TesteEquals {


    public static void main(String[] args) {
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }


        /*Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método format(), da classe String.
        Esse método permite formatar um texto utilizando diversos placeholders,
        que são representados pelo caractere %
        seguido de uma letra que indica o tipo de dado que será inserido no placeholder.
        Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e
        %f indica um valor de ponto flutuante.
         Vamos ver um exemplo:
        *  */

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

    }
}