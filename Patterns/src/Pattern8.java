
public class Pattern8 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			char ch='A';
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
				ch++;
			}
			ch=--ch;
			for(int j=1;j<=i-1;j++) {
				System.out.print(--ch);
			}
			System.out.println();
		}

	}

}
