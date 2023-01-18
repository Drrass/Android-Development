public class Main
{
	public static void main(String[] args) {
	    int a=5;
	    int b=10;
	    int sum=a+b;
	    
		System.out.println("sum of a and b is :"+sum);
	}
}


Another way of working on meathods is by passing parameter .
	
	
public class Main
{
	public static void main(String[] args) {
	   
	   int x=add(100,200);
	    
		System.out.println("sum of a and b is :"+x);
	}

	public static int add(int a,int b){
	     
	    int sum=a+b;
	    return sum;
	}
}

