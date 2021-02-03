package guguDan;
import java.util.Scanner;

public class ArrayGugudan {
	public static void main(String[] args) {
		
		System.out.println("출력할 단을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		int[] result  = new int[9];
		for ( int i = 0; i < result.length; i++ ) {
			result[i] =  number*(i+1);
		}
		
		for(int i = 0; i <= result.length; i++ ) {
			System.out.println(result[i]);
		}
	}
}

