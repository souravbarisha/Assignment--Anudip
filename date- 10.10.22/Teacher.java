package com.assignment;
//problem 1:

/*In this example, you have a base class Teacher and a 
sub class ITTeacher. Since class ITTeacher extends the designation
and college properties and work () method from base class,
we need not to declare these properties and method in sub class.
Here we have college Name, designation and work () method 
which are common to all the teachers so we have 
declared them in the base class,this way the child classes 
like Math Teacher, Music Teacher and PhysicsTeacher 
do not need to writethis code and can be used directly from base class.*/
	// base class
public class Teacher {
String designation;
String college;
Teacher(){
	this.designation = designation;
	this.college = college;
}
String work(String working){
	return working;
}

// child class 1
class ITTeacher extends Teacher {


	
}
//child class 2
class MathTeacher extends Teacher {

	
}
//child class 3
class  MusicTeacher  extends Teacher {

	
	
}
//child class 4
class  PhysicsTeacher extends Teacher {


	
}

// main method
public static void main(String [] args) {
	// CREATING OBJECT FOR ALL CLASS
	Teacher T = new Teacher();
	ITTeacher IT = T.new ITTeacher();
	MathTeacher MA = T.new MathTeacher();
	MusicTeacher MU = T.new MusicTeacher();
	PhysicsTeacher PH = T.new PhysicsTeacher();
	// CALL CLASS 1
	String itT = IT.designation = "IT - HEAD OF THE DEP";
	String itC = IT.college = "JADAVPUR UNIVERSITY";
	// CALL CLASS 2
	String maT = MA.designation = "MATH - HEAD OF THE DEP";
	String maC = MA.college = "KOLKATA UNIVERSITY";
	// CALL CLASS 3
	String muT = MU.designation = "MUSIC - HEAD OF THE DEP";
	String muC = MU.college = "KYALLANY UNIVERSITY";
	// CALL CLASS 4
	String phT = PH.designation = "PHYSICS - HEAD OF THE DEP";
	String phC = PH.college = "VIDYASAGAR UNIVERSITY";
	
	
	System.out.println("designation : "+ itT  +"... "+ "College name : "+ itC+"... "+ IT.work(" Teach IT subject ") );
	System.out.println("designation : "+ maT  +"... "+ "College name : "+ maC+"... "+ MA.work(" Teach Math subject ") );
	System.out.println("designation : "+ muT  +"... "+ "College name : "+ muC+"... "+ MU.work(" Teach Music subject ") );
	System.out.println("designation : "+ phT  +"... "+ "College name : "+ phC+"... "+ PH.work(" Teach Physics subject ") );
} 
}

