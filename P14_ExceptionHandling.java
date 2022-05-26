package Unit_03;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class P14_ExceptionHandling {

	public static void main(String[] args){
		BasicException1();
		BasicException2();
		BasicException3();
		BasicException4();
		BasicException5(10);
		BasicException6();
		checkedAndUncheckedException();
		BasicException7();
		useOfThrows_And_Finally();
		checkName("godofwar");
	}
	static void BasicException1() {
		int a=100,ans=0;
		ans=a/0;
	}
	static void BasicException2() {
		int a=100,ans=0;
		try {
			ans=a/0;
		}catch(ArithmeticException e){
			System.out.println("divide by zero");
		}		
	}
	static void BasicException3() {
		int a=100,ans=0;
		try {
			ans=a/0;
		}catch(ArithmeticException e){
			System.out.println("divide by zero");
		}finally {
			System.out.println("Final block");
		}
	}
	static void BasicException4() {
		int a;
		Scanner sc=new Scanner(System.in);
		try {
			a=sc.nextInt();			
		}catch(InputMismatchException e) {
			System.out.println("Wrong Input");
		}	
	}
	static void BasicException5(int a) {
		try {
			while(a>0) {
				a++;BasicException5(a);
			}
		}catch(Exception e){
			System.out.println("error");
		}
		
	}
	static void BasicException6() {
		int arr[]=new int[3];
		arr[0]=1;arr[1]=2;arr[2]=3;
		try {
			System.out.println(arr[10]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("Out of bounds");
		}
	}
	static void BasicException7() {
		try {
			int a=(Integer) null;
		}catch(NullPointerException e){
			System.out.println("Null");
		}
	}
	static void useOfThrow(int age) throws Exception, ArithmeticException, IOException {

		if (age < 18) {
			throw new Exception("Under 18");
		} else {
			System.out.println("You are allowed to enter");
		}

	}

	static void useOfThrows_And_Finally() {

		try {
			useOfThrow(10);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<3;i++)
			System.out.println("continue");

	}
	static void checkedAndUncheckedException() {
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);
		try {
			useOfThrow(19);
		} catch (Exception e) {
			e.printStackTrace();
		}
	} 
	static void checkName(String s){
		try {
			if(s.charAt(0)>95) {
				throw new IncorrectName();
			}
		}catch(IncorrectName e){
			System.out.println(e.getMessage());
		}
	}

}
@SuppressWarnings("serial")
class IncorrectName extends Exception{
	public IncorrectName() {
		super("First letter should be capital");
	}
}