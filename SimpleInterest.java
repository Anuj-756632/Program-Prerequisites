import java.util.*;
public class SimpleInterest{
       public static void main(String []args){
	          Scanner sc=new Scanner(System.in);
			  int p=sc.nextInt();
			  float r=sc.nextInt();
			  float t=sc.nextInt();
			  double si=(p*r*t)/100;
			  System.out.println("Simple Interest is: "+si);
		}
}