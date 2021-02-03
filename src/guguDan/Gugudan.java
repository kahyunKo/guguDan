package guguDan;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		
		if( number < 2 ) {
			System.out.println("2 이상, 9 이하의 값만 입력할 수 있습니다.");
		} else if ( number > 9 ) {
			System.out.println("2 이상, 9 이하의 값만 입력할 수 있습니다.");
		} else {
			for( int i = 1; i <= 9; i++ ) {
				int result = i*number;
				System.out.println(number + " * " + i + " = " + result );
			}
		}
	}
}
