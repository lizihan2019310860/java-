package xuanke;

public class Course {
	public String ID;
	public String name;
	public String classposion;
	public String schooltime;
	public String coursename;
	public Course(String ID,String name,String classposion,String schooltime,String coursename)
	{
		this.ID = ID;
		this.name = name;
		this.classposion = classposion;
		this.schooltime =  schooltime;
		this.coursename = coursename;
	}
	public String toString() {
		return "�γ̱��: "+this.ID+"  �γ�����: "+this.name+"  �Ͽεص�: "+this.classposion+"  �Ͽ�ʱ��:"
	+this.schooltime+"  �ڿν�ʦ:"+this.coursename;
	}
}
