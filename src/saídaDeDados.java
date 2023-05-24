import java.util.Locale; // biblioteca que permite a utilização de "Locale"

public class saídaDeDados {

    public static void main(String[] args) {

        int x = 18;
        double y = 10.27529;
        String nome = "Simon";
        int idade = 42;
        double renda = 4000.0;

        Locale.setDefault(Locale.US); // o Locale.US faz com que o double use . ao invés de ,
        System.out.println("Olá " + nome + "!");
        System.out.printf("%.2f%n", y); // pode usar %n ou \n para a quebra de linha

        // CONCATENAÇÃO
        System.out.println("RESULTADO = " + y + " METROS"); // Concatenacao de uma variável
        System.out.printf("RESULTADO = %.2f metros%n", y); // Concatenacao com printf e limitando o número de casas decimais

        // CONCATENAÇÃO COM TODAS AS VARIÁVEIS
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda); // É NECESSÁRIO AS VARIÁVEIS ESTAREM EM ORDEM
        /*
        %s para String
        %d para Inteiros
        %n é utilizado para quebrar linha
        %.2f limita o número de casas decimais, que nesse caso o limite são 2. um %.4f mostraria 4 casa decimais.

         */
    }
}
