
public class Pattern14 {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=6;i++) {
//			for(int j=1;j<=i-1;j++) {
//				System.out.print(" ");
//			}
			if(i==1) {
				System.out.print(0+" ");
			}
			else {
			for(int j=1;j<=i-1;j++) {
				System.out.print(num+" ");
				num=num+2;
			}
			System.out.print(0+" ");}
			System.out.println();
		}

	}

}
