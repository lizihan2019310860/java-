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
		return "��Ա���: "+this.ID+"  ����: "+this.peoplename+"  �Ա�: "+this.sex;
	}
}
