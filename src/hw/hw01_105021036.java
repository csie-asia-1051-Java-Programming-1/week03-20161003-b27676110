package hw;
import java.util.Scanner;
public class hw01_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        while(n>0){
        	sum = sum +1;
        	n = n/10; 	
		}
	System.out.println(sum);
}
}
