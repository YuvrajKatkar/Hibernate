package students;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int rollNo;
	private String name;
	private String branch;
	private byte year;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public byte getYear() {
		return year;
	}
	public void setYear(byte year) {
		this.year = year;
	}
	public Student(int rollNo, String name, String branch, byte year) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.year = year;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + ", year=" + year + "]";
	}
	
	
}
