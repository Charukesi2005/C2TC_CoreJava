package com.tnif.dayeleven;

public class UncheckedException {

	public static void main(String[] args) {
  int x[];
  try {
	  x=new int[] {1,2,3,4};
	  System.out.println(x[6]);//out of bound
  }
  catch (ArrayIndexOutOfBoundsException e) {
	  System.out.println("Specified index does not exist "+e. getMessage());
  }
  
  finally
  {
	  
  }
	}
	
	public UncheckedException() {
		// TODO Auto-generated constructor stub
	}
	
    
}