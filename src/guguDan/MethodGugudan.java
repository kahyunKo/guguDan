package guguDan;

public class MethodGugudan { 
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for( int i = 0; i < result.length; i++ ) {
			result[i] = times * (i+1);
		}
		return result;
	}   // int[] ��ȯ���� �迭�� ������ Ÿ��
	
	public static void print(int[] result) {
		for( int i = 0; i < result.length; i++ ) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		
		for ( int i = 2; i <= 9; i++ ) {
			int[] result = calculate(i);
			print(result);
		}
	}
}
