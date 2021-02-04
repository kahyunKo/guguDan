package guguDan;

public class MethodGugudan { 
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for( int i = 0; i < result.length; i++ ) {
			result[i] = times * (i+1);
		}
		return result;
	}   // int[] 반환받을 배열의 데이터 타입
	
	public static void main(String[] args) {
		
		int[] result = calculate(2);
		
		for( int i = 0; i < result.length; i++ ) {
			System.out.println(result[i]);
		}
		
		int[] times3 = calculate(3);
		
		for( int i = 0; i < times3.length; i++ ) {
			System.out.println(times3[i]);
		}
		
		int[] times4 = calculate(4);
		
		for( int i = 0; i < times4.length; i++ ) {
			System.out.println(times4[i]);
		}
	}
}
