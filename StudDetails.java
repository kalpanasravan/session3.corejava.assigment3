import java.util.Scanner;

/* program to display atleast 3 student details */
public class StudDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxs, nos;
	    Scanner ip1 = new Scanner(System.in);
	    System.out.print("\nEnter No. of Students : ");
	    nos = ip1.nextInt();
	    Student[] studInfos = new Student[nos];
	    for (maxs = 0; maxs < nos; maxs++) {
	        System.out.println("\nWelcome to Student database");
	        System.out.print("\n Enter Student [ " + (maxs + 1) + " ] details");
	        studInfos[maxs] = new Student();
	        studInfos[maxs].getDetails();
	    }
	    for (Student s : studInfos) {
	        s.display();
	    }
	}

}

class Student{
	
	float tot;
	int rollNo;
	String name;
	String course ;
	int eng,hn,math;
	
	void setDetails(int a,String sname,String scourse)
	{
		rollNo=a;
		name=sname;
		course=scourse;
	}
	
	void getDetails(){
	Scanner it=new Scanner(System.in);
		System.out.println("Enter roll no,name,course");
		rollNo=it.nextInt();
		name=it.next();
		course=it.next();
		System.out.println("Enter marks in hindi,eng,maths");
		eng=it.nextInt();
		hn=it.nextInt();
		math=it.nextInt();
		
    
}
	
	void display()
	{
		tot=eng+hn+math;
		float avg=tot/3;
		System.out.println("\n"+"\n Roll No.\t:\t"+rollNo+
			    "\n Name   \t:\t"+name+
			    "\n English\t:\t"+eng+
			    "\n Tamil   \t:\t"+hn+
			    "\n Maths   \t:\t"+math+
			    "\n Total   \t:\t"+tot+
			    "\n Average\t:\t"+avg);


			System.out.print(" Grade   \t:\t");
			if((eng>=50)&&(hn>=50)&&(math>=50))
			{
			if(avg>=91) System.out.print("O");
			else if(avg>=81) System.out.print("A");
			else if(avg>=71) System.out.print("B");
			else if (avg>=61) System.out.print("C");
			else if(avg>=51) System.out.print("D");
			else System.out.print("Fail");
			}
			else System.out.print("Fail");
			System.out.println();
	
	}
	}