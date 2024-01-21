package sample.inheritance;
import java.util.Scanner;
public class Loop {
	
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int j= sc.nextInt();
	
	for(int i=0;i<j;i++)
	
	System.out.println(i);
	sc.close();
	
 }

}

