
public class Pattern13 {

	public static void main(String[] args) {
		int num=2;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			System.out.print(0+" ");
			
			for(int j=1;j<=6-i;j++) {
				System.out.print(num+" ");
				num=num+2;
			}
			System.out.println();
		}

	}

}
