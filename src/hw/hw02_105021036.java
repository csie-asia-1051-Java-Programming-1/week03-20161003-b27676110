package hw;
import java.util.Scanner;
public class hw02_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入整數");
		int a =0,b=0,c=0;
		int k=1;
		while(k==1){
			int n = scn.nextInt();
			if(n>0){
				a=a+1;
			}else
				if(n==0){
					b=b+1;
				}else
					if(n<0){
						c=c+1;
					}System.out.println("繼續請按1結束請按2");
			int f=scn.nextInt();
					if(f==2){
						k=0;
					}
				}
		System.out.println("正整數"+a);
		System.out.println("零"+b);
		System.out.println("負整數"+c);
	}
}
