package guguDan;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("������ �� ����� ����?");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		
		if( number < 2 ) {
			System.out.println("2 �̻�, 9 ������ ���� �Է��� �� �ֽ��ϴ�.");
		} else if ( number > 9 ) {
			System.out.println("2 �̻�, 9 ������ ���� �Է��� �� �ֽ��ϴ�.");
		} else {
			for( int i = 1; i <= 9; i++ ) {
				int result = i*number;
				System.out.println(number + " * " + i + " = " + result );
			}
		}
	}
}
