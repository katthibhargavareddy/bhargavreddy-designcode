package DesignTask;

import org.junit.Test;

public class Calculator_test {
	
	Calculator obj=new Calculator();
	private float x;
	
	@Test
	public void addition()
	{
		 x = obj.addition(98765432f,786653421f);
	}
	@Test
	public void addition1()
	{
		 x = obj.addition(983441548f,781333455f);
	}
	@Test
	public void addition2()
	{
		 x = obj.addition(98765432f,7855557821f);
	}
	@Test
	public void subtraction()
	{
		 x = obj.subtraction(987226512f,78622355121f);
	}
	@Test
	public void subtraction1()
	{
		 x = obj.subtraction(8765442765f,9874525635f);
	}
	@Test
	public void subtraction2()
	{
		 x = obj.subtraction(9876589642f,7866777721f);
	}
	@Test
	public void multiplication()
	{
		 x = obj.multiplication(98765432f,786653421f);
	}
	@Test
	public void multiplication1()
	{
		 x = obj.multiplication(8765442765f,9874525635f);
	}
	@Test
	public void multiplication2()
	{
		 x = obj.multiplication(98765432f,786653421f);
	}
	
	@Test
	public void division()
	{
		 x = obj.division(987654332f,876543215f);
	}
	@Test
	public void division1()
	{
		 x = obj.division(98765432f,786653421f);
	}
	@Test
	public void division2()
	{
		 x = obj.division(98765432f,0f);
	}
	@Test
	public void division3()
	{
		 x = obj.division(0f,3916633155f);
	}
}
