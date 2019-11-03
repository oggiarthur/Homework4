package homeWork_4;

public class Student extends Human {
	private int group;
	private int grade;
	
	public Student (String name, String surname, int age, String sex, int group, int grade) {
		super(name,surname,age,sex);
		this.group=group;
		this.grade=grade;		
	}
	
	public Student() {
		this.group=0;
		this.grade=0;
		
	}
	
	public Student (String name, String surname, int age, String sex) {
		super(name,surname,age,sex);
	}
	public int getGroup(){
		return group;
		}
	public void setGroup(int group) {
		this.group=group;
	}
	
	public int getYearOfStudy() {
		return grade;
	}
	
	public void setYearPfStudy(int grade) {
		this.grade=grade;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + group;
		result = prime * result + grade;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Student other = (Student) obj;
		if (group != other.group) {
			return false;
		}
		if (grade != other.grade) {
			return false;
		}
		return true;
	}

	@Override
	public String toString(){
		return "________________ \nStudent: " + super.toString() 
					+" \nGroup last year: " + group + " \nAverege grade: " 
									+ grade + "\n________________";
	}
}
