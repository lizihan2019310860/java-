package xuanke;

public class Student {
	public String ID;
	public String studentname;
	public String sex;
	public String course;
	public Student(String ID,String studentname,String sex,String course)
	{
		this.ID = ID;
		this.studentname = studentname;
		this.sex = sex;
		this.course = course;
	}
	public String toString() {
		return "ѧ�����: "+this.ID+"  ����: "+this.studentname+"  �Ա�: "+this.sex+"  ��ѡ�γ�:"+this.course;
	}
}
