package xuanke;

public class Text {
	public static void main(String args[]){
		Student stu1 = new Student("2019123456","小明","男","高等数学");
		Teacher tea1 = new Teacher("101","李老师","男","物理");
		Course cou1 = new Course("1","物理","101","第1-2小节","李老师");
		People peo1 = new People("2019987654","小红","女");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
	}
}
