package xuanke;

public class Teacher {
	public String ID;	 
	public String teachername;
	public String sex;
	public String coursename;
	public Teacher(String ID,String teachername,String sex,String coursename)
	{
		this.ID = ID;
		this.teachername = teachername;
		this.sex = sex;
		this.coursename = coursename;
	}
	public String toString() {
		return "��ʦ���: "+this.ID+"  ����: "+this.teachername+"  �Ա�: "+this.sex+"  ���ڿγ�:"+this.coursename;
	}
}