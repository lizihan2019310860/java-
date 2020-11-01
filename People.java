package xuanke;

public class People {
	public String ID;
	public String peoplename;
	public String sex;
	public People(String ID,String peoplename,String sex)
	{
		this.ID = ID;
		this.peoplename = peoplename;
		this.sex = sex;
	}
	public String toString() {
		return "人员编号: "+this.ID+"  姓名: "+this.peoplename+"  性别: "+this.sex;
	}
}
