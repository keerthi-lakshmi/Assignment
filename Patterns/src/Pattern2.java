
public class Pattern2 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=5-i;j>=1;j--) {
				System.out.print(" ")	;		}
			for(int j=2*i-1;j>=1;j--) {
				System.out.print("*")	;		}
			System.out.println();
		}

	}

}
