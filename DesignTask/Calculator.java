package DesignTask;

public class Calculator implements CalInFace{

	@Override
	public float addition(float x, float y) {
		
		return x+y;
	}

	@Override
	public float subtraction(float x, float y) {
		
		return x-y;
	}

	@Override
	public float multiplication(float x, float y) {
		
		return x*y;
	}

	@Override
	public float division(float x, float y) {
		float Result=0;
		try
		{
		Result = x/y;
		}
		catch(Exception  obj)
		{
			System.out.print(obj);
		}
		return Result;
	}

}
