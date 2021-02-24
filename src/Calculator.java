public class Calculator {
	float x, y;
	
	float multiply(float x, float y) 
  {
		return x*y;
	}
		
  float Add(float x, float y)
  {
	  return x+y;
  }


	public static void main(String[] args) 
	{
    System.out.println("Multiply: "+multiply);
    System.out.println("Add: "+Add);
	}

}
