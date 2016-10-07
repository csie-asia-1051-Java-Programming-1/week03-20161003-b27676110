package hw;
import java.util.Scanner;
public class hw04_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n = scn.nextInt();
		int sum=1,i=1;
		while(i<=n){
		sum=sum*i;
		i = i + 1;
		}
		System.out.println(sum);

	}

}
