package hw;
import java.util.Scanner;
public class hw05_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int sum=0,i = 1;
		while(n>=i){
		sum = sum+i*(i+1);
		i++;
		}
		System.out.println(sum);

	}

}
