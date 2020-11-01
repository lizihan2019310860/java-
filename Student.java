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
		return "学生编号: "+this.ID+"  姓名: "+this.studentname+"  性别: "+this.sex+"  所选课程:"+this.course;
	}
}
