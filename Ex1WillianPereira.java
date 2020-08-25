// Willian Pereira Domingues
// 0050015918
import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um valor inteiro: ");
		int valor = input.nextInt();
		for (int i = 0; i < 10; i++){
			System.out.println(valor + "*" + i + "=" + (valor * i));
		}
	}
}
