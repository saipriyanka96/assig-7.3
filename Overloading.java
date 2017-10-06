package th;
//Package is a grouping of related types providing access protection and name 

public class Overloading {
	//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
	//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
	//Overloading is a class name
	private int rollno;
//private is used for same class
    private double marks;

    

  public  Overloading(){
	  //default constructor
//If we are having same class name and different parameter is called as overloading
	  rollno =0;

	  marks=0;

  }

	public Overloading(int rollno){
//parameterized constructor
		this.rollno=rollno;

	}	

	public Overloading(int rollno,double marks){
//this refer to the current object 
			this.rollno=rollno;

			this.marks=marks;

	}	

			

		public void display(){

			System.out.println("Rollno:"+rollno);

			System.out.println("Marks:" +marks);

			

		}

		

}

  

  

	

	



