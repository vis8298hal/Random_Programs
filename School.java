import java.util.Scanner;
class Students{
	public String Name;
	public int studClass;
	public int Roll;
	public String Admission;
	public String dob;
	public String section;
	public Students(int rl,String nm,String sec,String Adm,String db)
	{
		this.Name=nm;
		this.Roll=rl;
		this.section=sec;
		this.studClass=11;
		this.Admission=Adm;
		this.dob=db;
		
	}
	public void Display()
	{
		System.out.println(this.Name);
		System.out.println(this.studClass);
		System.out.println(this.section);
		System.out.println(this.Roll);
		System.out.println(this.Admission);
		System.out.println(this.dob);
		
	}
}
public class School
{
	public static void main(String[] args)
	{
		Students[] studentList=new Students[5];
		studentList[0]=new Students(1,"Rahul","B","SC102","20-01-2004");
		studentList[1]=new Students(2,"Ajay","A","SS102","20-01-2003");
		studentList[2]=new Students(3,"Sunny","B","SC103","20-01-2004");
		studentList[3]=new Students(4,"Sanjay","A","MA102","20-01-2003");
		studentList[4]=new Students(5,"Akshay","B","SC105","20-01-2004");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Admission number You want Data of : ");
		System.out.println("SC102");
		System.out.println("SC103");
		System.out.println("SC105");
		System.out.println("SS102");
		System.out.println("MA102");
		int flag=0;
		if(flag==0)
		{
		    String ans = sc.nextLine();
		    for(int i=0;i<studentList.length;i++)
		    {
		    if(studentList[i].Admission.equals(ans))
		    {
		        flag=0;
		        studentList[i].Display();
		        break;
		    }
		    else{
		        flag+=1;
		        continue;
		    }
		    }
		}
		else{
		    System.out.println("No Data Found Sorry");
		}
	}
}	