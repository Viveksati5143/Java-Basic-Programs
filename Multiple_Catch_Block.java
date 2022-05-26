package Unit_03;

public class Multiple_Catch_Block {

	    public static void  main(String[]args)
	    {
	        try
	        {
	            int arr[] = new int[5];
	            arr[5] = 100/0;
	        }
	        catch(ArithmeticException e)
	        {
	          System.out.println("Arithmetic Exception");
	        }
	        catch (ArrayIndexOutOfBoundsException e)
	        {
	            System.out.println("Exception handle 2nd time");
	        }
	    }
	}