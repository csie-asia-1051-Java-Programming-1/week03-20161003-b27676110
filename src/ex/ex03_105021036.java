package ex;
/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)

 * Date: 2016/10/03
 * Author: 105021036 鄭東欣
 */
import java.util.Scanner;
public class ex03_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        char ch1 = scn.next().charAt(0);
        if(ch1>65&&ch1<=90){
        	System.out.println(Character.toUpperCase(ch1));
	}else{
        if(ch1>96&&ch1<=122){
		System.out.println(Character.toUpperCase(ch1));
		}

	}

}
}
