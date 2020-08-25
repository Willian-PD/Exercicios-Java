// Willian Pereira Domingues
// 0050015918
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int valor = input.nextInt();
		if (valor % 2 == 0){ System.out.println(valor + " é par!"); }
		else{ System.out.println(valor + " é impar!");}
	}
}