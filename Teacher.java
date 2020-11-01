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
		return "教师编号: "+this.ID+"  姓名: "+this.teachername+"  性别: "+this.sex+"  教授课程:"+this.coursename;
	}
}