import java .util.Locale;
public class Main {

	
	// treinamento Java programas basicos//
	public static void main(String[] args) {
		
        String nome = "LAURINDO";
        int idade = 25;
        double vencimento = 950;
		double x = 10.35784;
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
        System.out.println("RESULTADO = " + x + " METROS ");
        System.out.printf("RESULTADO = %.2f metros%n", x);
    /*Saida de dados na tela, utilizando  quebras de linha concatenadas de varios valores interpolados, dentro de uma String*/
        System.out.printf("%s tem %d anos de idade vencimento € %2f euros%n", nome, idade, vencimento);
    
        /* Meu primeiro Exercicio, regras de utilizacao, de quebras de linha, concatenacao, dentro de strings*/
      
        String produt1 = "Computer";
        String produt2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'M';
        double price1 = 2500.0;
        double price2 = 750.50;
        double measure = 55.255;
        System.out.println("Products:");
        System.out.printf("%s With  price1 is € %.2f%n", produt1, price1);
        System.out.printf("%s Office witch price is € %.2f%n", produt2, price2);
        System.out.println();
        System.out.printf("Record: %d He years old, code %d e gender: %c%n", age, code, gender);
        System.out.printf("measure with eight decimal places: %.8f%n", measure);
        System.out.printf("US decimal point: %.3f%n",measure);
        
        

	}
}
