package main;

import java.util.Scanner;

public class main {
public static void main(String[] Args) {
	Scanner scan=new Scanner(System.in);
	int a=1;
	boolean bool1,bool2 =true;
	while(a!=0) {
	a=scan.nextInt();
 bool1=true;
bool2=true;
	String scr=scan.nextLine();
		for (int i=0;i<a;i++) {
			if (scr.charAt(i+1)=='I')
				bool1=false;
			else if (scr.charAt(i+1)=='D')
				bool2=false;
		}
	if(bool1==false&&bool2==false)
		System.out.println("ALGUNO NO COME");
	else
		System.out.println("TODOS COMEN");
	}

	
	
}
}
