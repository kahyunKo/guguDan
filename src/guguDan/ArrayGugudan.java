package guguDan;

public class ArrayGugudan {
	public static void main(String[] args) {
		
		for( int j = 2; j < 10; j++ ) {
			int[] result  = new int[9];
			for ( int i = 0; i < result.length; i++ ) {
				result[i] =  j * ( i + 1 );
			}
		
			System.out.println(j+"´Ü Ãâ·Â");
			
			for(int i = 0; i < result.length; i++ ) {
				System.out.println(result[i]);
			}
		}
	}
}

