import java.util.Scanner;
public class ShiftySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		/*
		 * Follow the instructions in Junior Problem 2.pdf.
		 * Use the following data to test your program and record your answers
		 * 1) 1,0 = 1
		 * 2) 1,3 = 1111
		 * 3) 99,4 = 1099989
		 * 4) 10000,5 = 1111110000
		 * 5) 9139,4 = 101543429
		 * 6) 9252,5 = 1027998972
		 * 7) 888,0 = 888
		 * 8) 4578,1 = 50358
		 * 9) 2746,2 = 304806
		 * 10) 6295,3 = 6993745
		 * 11) 6884,4 = 76488124
		 * 12) 1198,5 = 133110978
		 * 13) 8655,0 = 8655
		 * 14) 2503,1 = 27533
		 * 15) 7868,2 = 873348
		 */
		
		int n,k,p,result,a,b,c,d,e;
		n=in.nextInt();
		k=in.nextInt();
		a=n*10;
		b=a*10;
		c=b*10;
		d=c*10;
		e=d*10;
		
		if (k==5) {
			System.out.println(n+a+b+c+d+e);
		}
		if (k==4) {
			System.out.println(n+a+b+c+d);
		} if (k==3) {
			System.out.println(n+a+b+c);
		} if (k==2) {
			System.out.println(n+a+b);
		} if (k==1) {
			System.out.println(n+a);
		} if (k==0) {
			System.out.println(n);
		} else {
			
		}
		 
			in.close();
	}

}
