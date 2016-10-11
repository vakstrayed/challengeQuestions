import java.util.Scanner;

//4th Bit

public class Question3 {
	
	
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		Integer entrada = teclado.nextInt();
		System.out.print("Resultado: ");
		fourthBit(entrada);
		
	}
	
	public static void fourthBit(Integer x){
		
		String num = x.toBinaryString(x);
		char[] c = num.toString().toCharArray();

		System.out.println(c[c.length -3]);
		
	}
	

}
