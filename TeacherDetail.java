package Module2;

public class TeacherDetail 
{
	int tid;
	String tname;
	String taddress;
	String tmno;
	String tmail;
	String salary;
	
	
	
	
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTmno() {
		return tmno;
	}
	public void setTmno(String tmno) {
		this.tmno = tmno;
	}
	public String getTmail() {
		return tmail;
	}
	public void setTmail(String tmail) {
		this.tmail = tmail;
	}
	public String getTaddress() {
		return taddress;
	}
	public void setTaddress(String taddress) {
		this.taddress = taddress;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return   "tid=" + tid + "			tname=" + tname + "		taddress=" + taddress+ "		tmno=" + tmno + "		tmail=" + tmail + "		salary=" + salary ;
	}
	
	
	
}
