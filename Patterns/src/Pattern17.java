
public class Pattern17 {

	public static void main(String[] args) {
		int num=3;
		for(int i=1;i<=4;i++) {
			
			for(int j=num;j<=3;j++) {
				System.out.print(j);
				
			}
			num--;
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			
			for(int j=i;j<=3;j++) {
				System.out.print(j);
				
			}
			num--;
			System.out.println();
		}
//		int n = 3;
//		int i;
//		int j;
//
//		for (i = n; i >= -n; i--) {
//			for (j = Math.abs(i); j <= n; j++) {
//				System.out.print(j);
//			}
//
//			System.out.println(" ");
//		}
	}

}
