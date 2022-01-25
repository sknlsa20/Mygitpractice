package com.src.model;

public class Student {
	
	private int stdid;
	private String stdname;
	private String stdaddress;
	private int stdage;
	private long stdmobileno;
	
	
	
	public Student(int stdid) {
		super();
		this.stdid = stdid;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdaddress=" + stdaddress + ", stdage=" + stdage
				+ ", stdmobileno=" + stdmobileno + "]";
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdid, String stdname, String stdaddress, int stdage, long stdmobileno) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdaddress = stdaddress;
		this.stdage = stdage;
		this.stdmobileno = stdmobileno;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getStdaddress() {
		return stdaddress;
	}
	public void setStdaddress(String stdaddress) {
		this.stdaddress = stdaddress;
	}
	public int getStdage() {
		return stdage;
	}
	public void setStdage(int stdage) {
		this.stdage = stdage;
	}
	public long getStdmobileno() {
		return stdmobileno;
	}
	public void setStdmobileno(long stdmobileno) {
		this.stdmobileno = stdmobileno;
	}
	
	
	

}
