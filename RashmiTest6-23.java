 6) ArrayList                                              LinkedList
  1) Arraylist is index based                        1) LinkedList is non index based
  
  2)Arraylist can access positional based            2) LinkedList can not access positional based
  
  3)it is ordered                                    3) it is unordered
  
  
  4) a)we should decleare class as "final" then any class cannot inherited.
  
     c) interface,Abstraction.
  
  5) Tree set
  
  11) by declearing properties as "private"
  
  
 10) There are two types of polymorphism
  
   1)Static polymorphism(overloding)
   2)Dynamic polymorphism(overriding)
  
     1)Static polymorphism(overloding): Compiler will check the method signature this is called Static polymorphism.
	 Static polymorphism achived through overloding.
overloading means A class can have same name with different parameters.

example:

class Operation{
	
	public int multiplication(int a,int b){
		return a*b;
	}
	public int multiplication(int a,int b,int c){
		return a*b*c;
	}
	
	
}
class OperationRunner{
	public static void main(String[] args){
		
		
		Operation op=new Operation();
		op.multiplication(1,2);
		op.multiplication(1,2,3);
	}
}
 
 
 1)Dynamic polymorphism(overriding): jvm will decide which class have to call first whether child class or parent class
	 Dynamic polymorphism achived through overriding.
overriding means sub class provide implementation for the method in the parent class.

class 	Employee{
	int salary=25000;
}
class Programmer extends Employee{
	
	int bonus=10000;
	int salary=25000;
	
}
class EmployeeRunner{
	public static void main(String[] args){
		
		Programmer pro=new Programmer();
		pro.bonus;
		pro.salary;
		pro.salary;
		
	}
}















