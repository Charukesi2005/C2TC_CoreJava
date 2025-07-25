package com.tnif.dayone;
import java.util.Scanner;
public class Addition {
public static void main(String[] args) {
	int a;
	int b;
	int c;
	Scanner scanner=new Scanner(System.in);
	a = scanner.nextInt();
	b = scanner.nextInt();
	c=a+b;
	System.out.println("Addition of a="+a+",b="+b+" is "+c);
}
}
