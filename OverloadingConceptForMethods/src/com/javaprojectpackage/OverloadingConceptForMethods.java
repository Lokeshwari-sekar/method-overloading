package com.javaprojectpackage;
//method over loading...(compile time polymorphism)
//class creation
class Overload
{
	//method overloading
	void add(int i,int j)//two integer arguments
	{
		int sum=i+j;
		System.out.println("sum of two integers is "+sum);
	}
	
	void add(float i,float j)//two float arguments
	{
		float sum=i+j;
		System.out.println("sum of two floating piont value is"+sum);
	}
}

public class OverloadingConceptForMethods
{

	public static void main(String[] args) 
	{
		//object creation
		Overload ol=new Overload();
		//method calling
		ol.add(4, 5);
		ol.add(3.3f, 5.6f);

	}

}
