public class Condicionais {

    public static void main(String[] args) {

        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os usuário estão curtindo!");
        } else{
            System.out.println("Filme retrô que vale a pena assistir!");
        }
        if (incluidoNoPlano == true || tipoPlano.equals("Plus")){
            System.out.println("Filme Liberado");
        } else{
            System.out.println("Pague a nova versão");
        }
    }

}
