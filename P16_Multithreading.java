package Unit_03;

	import java.util.Scanner;

	// Task in user hand - Identify dependent and non dependent task in respective process
	// Insert selective task into threads 
	// start those threads

	public class P16_Multithreading {

	    public static void main(String[] args) {
	        Thread T1=new Thread(new T1(),"t1");
	        Thread T2=new Thread(new T2(),"A");
	        Thread T3=new Thread(new T3(),"B");
	        T1.start();
	        T2.start();
	        T3.start();
	    }
	}
	class C1{
	    void show1() {
	        Scanner sc=new Scanner(System.in);
	        int r=sc.nextInt();
	        System.out.println(r);
	    }
	}
	class C2{
	    void show2() {
	        for(int i=0;i<10;i++) {
	            System.out.println("GO");
	        }
	    }

	}
	class T1 extends Thread{
	    public void run() {
	        Scanner sc=new Scanner(System.in);
	        int r=sc.nextInt();
	        System.out.println(Thread.currentThread().getName());
	    }
	}
	class T2 extends Thread{
	    public void run() {
	        for(int i=0;i<10;i++) {
	            System.out.println(Thread.currentThread().getName());
	        }
	    }

	}
	class T3 extends Thread{
	    public void run() {
	        for(int i=0;i<10;i++) {
	            System.out.println(Thread.currentThread().getName());
	        }
	    }

	}
	//class T4 extends Thread{
//		public void run() {
//			for(int i=0;i<10;i++) {
//				System.out.println(Thread.currentThread().getName());
//			}
//		}
	//	
	//}