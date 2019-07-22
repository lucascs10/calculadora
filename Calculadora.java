import java.io.IOException;
import java.util.Scanner;

public class Calculadora{

	public static void main(String[] args) throws IOException, InterruptedException {

		int contador;
		double n1, n2, resultado;		

		do{ 
			System.out.println("\n=========== Calculadora ===========\n");
			System.out.println("1 - Adição\n");
			System.out.println("2 - Subtração\n");
			System.out.println("3 - Multiplicação\n");
			System.out.println("4 - Divisão\n");
			System.out.println("5 - Sair");
			System.out.println("\n===================================\n");

			Scanner ler = new Scanner(System.in);

			System.out.println("Digite um valor para continuar: \n");
			contador = ler.nextInt();

			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
			    Runtime.getRuntime().exec("clear");
			    			    
			switch(contador){

				//Adição
				case 1:
					
					System.out.println("\n=========== Adição =========== ");
							
					System.out.println("\nDigite o primeiro valor: \n");
					n1 = ler.nextDouble();
					

					System.out.println("\nDigite o segundo valor: \n");
					n2 = ler.nextDouble();
					

					resultado = (n1+n2);

					System.out.println("\n============================== ");

					System.out.println("\nResultado: "+resultado);

					System.out.println("\n==============================\n");

					System.out.println("Pressione Enter para Continuar!");
					System.in.read();

					if (System.getProperty("os.name").contains("Windows"))
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					else
					    Runtime.getRuntime().exec("clear");
					
				break;

				//Subtração
				case 2:
					
					System.out.println("\n=========== Subtração =========== ");
							
					System.out.println("\nDigite o primeiro valor: \n");
					n1 = ler.nextDouble();
					

					System.out.println("\nDigite o segundo valor: \n");
					n2 = ler.nextDouble();
					

					resultado = (n1-n2);

					System.out.println("\n============================== ");

					System.out.println("\nResultado: "+resultado);

					System.out.println("\n==============================\n");

					System.out.println("Pressione Enter para Continuar!");
					System.in.read();

					if (System.getProperty("os.name").contains("Windows"))
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					else
					    Runtime.getRuntime().exec("clear");
					
				break;

				//Multiplicação
				case 3:
					
					System.out.println("\n=========== Multiplicação =========== ");
							
					System.out.println("\nDigite o primeiro valor: \n");
					n1 = ler.nextDouble();
					

					System.out.println("\nDigite o segundo valor: \n");
					n2 = ler.nextDouble();
					

					resultado = (n1*n2);

					System.out.println("\n============================== ");

					System.out.println("\nResultado: "+resultado);

					System.out.println("\n==============================\n");

					System.out.println("Pressione Enter para Continuar!");
					System.in.read();

					if (System.getProperty("os.name").contains("Windows"))
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					else
					    Runtime.getRuntime().exec("clear");
					
				break;

				//Divisão
				case 4:
					
					System.out.println("\n=========== Divisão =========== ");
							
					System.out.println("\nDigite o primeiro valor: \n");
					n1 = ler.nextDouble();
					

					System.out.println("\nDigite o segundo valor: \n");
					n2 = ler.nextDouble();
					

					resultado = (n1/n2);

					System.out.println("\n============================== ");

					System.out.println("\nResultado: "+resultado);

					System.out.println("\n==============================\n");

					System.out.println("Pressione Enter para Continuar!");
					System.in.read();

					if (System.getProperty("os.name").contains("Windows"))
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					else
					    Runtime.getRuntime().exec("clear");
					
				break;

				case 5:
					System.out.println("\n=============================="); 
					System.out.println("\nSaindo...\n");
					System.out.println("==============================\n");
					System.in.read();

					if (System.getProperty("os.name").contains("Windows"))
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					else
					    Runtime.getRuntime().exec("clear");

				break;
				
				default:
					System.out.println("\n=============================="); 
					System.out.println("\nOpção inválida!\n");
					System.out.println("==============================\n");

					System.out.println("Pressione Enter para Continuar!");
					System.in.read();

					if (System.getProperty("os.name").contains("Windows"))
						new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					else
					    Runtime.getRuntime().exec("clear");
			}

		}while (contador != 5);

	
	}
}










