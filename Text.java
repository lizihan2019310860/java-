package xuanke;

public class Text {
	public static void main(String args[]){
		Student stu1 = new Student("2019123456","С��","��","�ߵ���ѧ");
		Teacher tea1 = new Teacher("101","����ʦ","��","����");
		Course cou1 = new Course("1","����","101","��1-2С��","����ʦ");
		People peo1 = new People("2019987654","С��","Ů");
		
		System.out.println(stu1.toString());
		System.out.println(tea1.toString());
		System.out.println(peo1.toString());
		System.out.println(cou1.toString());
	}
}
