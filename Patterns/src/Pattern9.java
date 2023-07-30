
public class Pattern9 {

	public static void main(String[] args) {
		char ch='E';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			ch=--ch;
			for(int j=1;j<=i;j++) {
				ch=--ch;
			}
			System.out.println();
		}

	}

}
