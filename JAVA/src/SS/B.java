package SS;

public class B{  
	String color="white";  
	}  
	class C extends B{  
	String color="black";  
	void printColor(){  
	System.out.println(color);//prints color of Dog class  
	System.out.println(super.color);//prints color of Animal class  
	}  
	}  
	class TestSuper1{  
	public static void main(String args[]){  
	B d=new B();  
	d.printColor();  
	}} 
