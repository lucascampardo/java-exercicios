import java.util.Locale;

public class exercicioDeFixacao {

    public static void main(String[] args) {

        String produto1 = "Computador";
        String produto2 = "Office Desk";

        int idade = 30;
        int id = 7725;
        char sexo = 'F';

        double preco1 = 2100.0;
        double preco2 = 670.90;
        double measure = 53.2345678;

        System.out.println("Produtos:");
        System.out.printf("%s :  R$%.2f%n", produto1, preco1);
        System.out.printf("%s : R$%.2f%n", produto2, preco2);

        System.out.printf("Record: %d anos, code %d e sexo %c%n", idade, id, sexo);

        System.out.printf("Measure: %.8f%n", measure);
        System.out.printf("Rouded: %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("Ponto Flutuante US: %.3f%n", measure);

    }
}
