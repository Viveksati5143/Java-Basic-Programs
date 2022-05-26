package Unit_03;

public class Finally {

	    public static void main(String[]args)
	    {
	        try
	        {
	            int data = 25/5;
	            System.out.println(data);
	        }
	        catch (NullPointerException e)
	        {
	            //Exception handle
	            System.out.println(e);
	        }
	        finally {
	            System.out.println("Finally block is always run...!!");
	        }
	    }
	}


	//Catch k baad hi finally use hoga
	//Finally always run whenever the try block is run or not....!!
	//if there is an exception on try block and u have finally is always run
	//Finally is always run whenever the try or catch block run or not !!
	//Appropriate catch is use...!!


	//Checked and unchecked...?