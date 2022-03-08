package Module2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class School_Management_System 
{
	int id;
	String name;
	String address;
	String mno;
	String mail;

	public int getId()
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getMno() 
	{
		return mno;
	}

	public void setMno(String mno)
	{
		this.mno = mno;
	}

	public String getMail() 
	{
		return mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

	@Override
	public String toString()
	{
		return " id=" + id + "			 name=" + name + "		address=" + address + "		 mno=" + mno
				+ "		mail=" + mail;
	}

	public static void main(String[] args) 
	{
		char ch1;
		School_Management_System s;
		TeacherDetail s4;
		

		List<TeacherDetail> c = new ArrayList<TeacherDetail>();
		ArrayList<School_Management_System> arr = new ArrayList();
		ArrayList<TeacherDetail> arr1 = new ArrayList();

		Scanner sc = new Scanner(System.in);

		System.out.println("\n********************Edubridge_School_Management_System********************\n");

		System.out.println("1. Add Student Details ");
		System.out.println("2. Show Student Details ");
		System.out.println("3. Search Student Details ");
		System.out.println("4. Update Student Details ");
		System.out.println("5. Delete Student Details ");
		System.out.println("6. Add Teacher Details ");
		System.out.println("7. Show Teacher Details ");
		System.out.println("8. Update Teacher Details ");
		do 
		{
			System.out.println("\n Enter Your Choice : \n ");
			int ch = sc.nextInt();
			switch (ch) 
			{
			case 1:
						s = new School_Management_System();
		
						System.out.print("********************Add Student Details********************\n");
						System.out.print("Enter Student ID :");
						int sid = sc.nextInt();
						System.out.print("Enter Student Name :");
						String sname = sc.next();
						System.out.print("Enter Student Address :");
						String saddress = sc.next();
						System.out.print("Enter Student Mobile_No :");
						String smno = sc.next();
						System.out.print("Enter Student Email_Id :");
						String smail = sc.next();
		
						s.setId(sid);
						s.setName(sname);
						s.setAddress(saddress);
						s.setMno(smno);
						s.setMail(smail);
						arr.add(s);
						System.out.println("Student Details Has Been  Successfully Added");
			break;

			case 2:
						System.out.println("\n********************Show Student Details********************\n");
						System.out.print("\n Student_Id" + "\t\t" + "Student_Name" + "\t\t" + "Student_Address" + "\t\t"
								+ "Student_ob_no" + "\t\t" + "Student_Emailid \n");
		
						Iterator<School_Management_System> itr = arr.iterator();
		
						while (itr.hasNext())
						{
							School_Management_System s1 = itr.next();
							System.out.println(s1);
						}
		
			break;

			case 3:
						s = new School_Management_System();
						System.out.println("\n********************Search Student Details********************\n");
						System.out.println("Enter Student Id to Search Student");
						int srch = sc.nextInt();
		
						for (int i = 0; i < arr.size(); i++) 
						{
							if (arr.get(i).getId() == srch)
							{
								System.out.println(arr.get(i));
		
							    break;
							} 
							else 
							{
								System.out.println("Record not available");
							}
						}

			break;

			case 4:
							s = new School_Management_System();
							System.out.println("\n********************Update Student Details********************\n");
							System.out.println("Enter Student Id to Update Student Details");
							int updt = sc.nextInt();
			
							for (int i = 0; i < arr.size(); i++) 
							{
								if (arr.get(i).getId() == updt)
								{
									System.out.println(arr.get(i));
			
									System.out.println("Student ID \n" + arr.get(i).getId());
									// int sid1=sc.nextInt();
									System.out.println("Enter Student Name");
									String sname1 = sc.next();
									System.out.println("Enter Student Address");
									String saddress1 = sc.next();
									System.out.println("Enter Student Mobile_No");
									String smno1 = sc.next();
									System.out.println("Enter Student Email_Id");
									String smail1 = sc.next();
			
									s.setId(arr.get(i).getId());
									s.setName(sname1);
									s.setAddress(saddress1);
									s.setMno(smno1);
									s.setMail(smail1);
									arr.set(i, s);
									System.out.println("Student Details Has Been  Successfully Updated");
								}
			
							}
			 break;

			 case 5:
							s = new School_Management_System();
							System.out.println("\n********************Delete Student Details********************\n");
							System.out.println("Enter Student Id to Delete Student Details");
							int delt = sc.nextInt();
							String nm = "Not Available";
			
							for (int i = 0; i < arr.size(); i++)
							{
								if (arr.get(i).getId() == delt)
								{
									arr.remove(i);
									nm = "Student Details Has Been  Successfully Deleted";
								}
							}
							System.out.println(nm);
				break;

			    case 6:
							s4 = new TeacherDetail();
							System.out.println("********************Add Teacher Details********************");
							//System.out.println("Add Teacher");
							System.out.println("Enter Teacher Id");
							int teid = sc.nextInt();
							System.out.println("Enter Teacher Name");
							String tename = sc.next();
							System.out.println("Enter Teacher Address");
							String teaddress = sc.next();
							System.out.println("Enter Teacher Mobile_No");
							String temno = sc.next();
							System.out.println("Enter Teacher Email_Id");
							String temail = sc.next();
							System.out.println("Enter Teacher Salary");
							String tsalary = sc.next();
							s4.setTid(teid);
							s4.setTname(tename);
							s4.setTaddress(teaddress);
							s4.setTmno(temno);
							s4.setTmail(temail);
							s4.setSalary(tsalary);
							arr1.add(s4);
							System.out.println("Teacher Details Has Been  Successfully Added");

				break;

			    case 7:

							System.out.println("********************Show Teacher Details********************");
							System.out.println("\n Teacher_Id" + "\t\t" + "Teacher_Name" + "\t\t" + "Teacher_Address" + "\t\t"
									+ "Teacher_Mob_no" + "\t\t" + "Teacher_Emailid" + "\t\t" + "Teacher_Salary \n");
			
							System.out.println(arr1);

				break;

			    case 8:
							s4 = new TeacherDetail();
							System.out.println("********************Update Student Details********************");
							System.out.println("Enter Student Id to Update Student Details");
							int updt1 = sc.nextInt();
			
							for (int i = 0; i < arr1.size(); i++) {
								if (arr1.get(i).getTid() == updt1) {
									System.out.println(arr1.get(i));
			
									System.out.println("Teacher ID \n" + arr1.get(i).getTid());
									// int sid1=sc.nextInt();
									System.out.println("Enter Teacher Name");
									String tname1 = sc.next();
									System.out.println("Enter Teacher Address");
									String taddress1 = sc.next();
									System.out.println("Enter Teacher Mobile_No");
									String tmno1 = sc.next();
									System.out.println("Enter Teacher Email_Id");
									String tmail1 = sc.next();
									System.out.println("Enter Teacher Salary");
									String tsalary1 = sc.next();
			
									s4.setTid(arr1.get(i).getTid());
									s4.setTname(tname1);
									s4.setTaddress(taddress1);
									s4.setTmno(tmno1);
									s4.setTmail(tmail1);
									s4.setSalary(tsalary1);
									arr1.set(i, s4);
			
									System.out.println("Teacher Details Has Been  Successfully Updated");
								}
			
							}
				break;
				
			    default:
			    					System.out.println("invalid  input");
			}
			System.out.println("do u want to continue");
			ch1 = sc.next().charAt(0);

		}

		while (ch1 == 'y' || ch1 == 'Y');

	}

}
