import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1=sc.nextInt();
		System.out.println("Enter second number:");
		int n2=sc.nextInt();
		System.out.println("Enter third number:");
		int n3=sc.nextInt();
		System.out.println("Enter fourth number:");
		int n4=sc.nextInt();
		System.out.println("Enter fifth number:");
		int n5=sc.nextInt();
			if(n1>n2)
				if(n1>n5)
				System.out.println("The greatest number is:"+n1);
			if(n2>n1)
				if(n2>n5)
					System.out.println("The greatest number is:"+n2);
			if(n3>n2)
				if(n3>n5)
				System.out.println("The greatest number is"+n3);
			if(n4>n2)
				if(n4>n5)
				System.out.println("The greatest number is:"+n4);
		
	}
    }
