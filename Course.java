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
		return "课程编号: "+this.ID+"  课程名称: "+this.name+"  上课地点: "+this.classposion+"  上课时间:"
	+this.schooltime+"  授课教师:"+this.coursename;
	}
}
