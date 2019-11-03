package homeWork_4;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Group implements Voencom {
	private Student[] groupOfStudents=new Student[10];
	
	public Group(Student[] group) {
	this.groupOfStudents=group;
		this.groupOfStudents=new Student[10];
	}
	
	public Group(){
		}
	public Student[] getStud() {
		return groupOfStudents;
	}
		public void addingStud(Student st) throws homeWork_4.StudentException, homeWork_4.FullGroupException {
			int id = -1;
			for (int i = 0; i < groupOfStudents.length; i++) {
				if (groupOfStudents[i] != null && groupOfStudents[i].equals(st)) {
					throw new homeWork_4.StudentException();
				}
				if (groupOfStudents[i] == null && id == -1) {
					id = i;
				}
			}
			if (id == -1) {
				throw new homeWork_4.FullGroupException();
			} else {
				groupOfStudents[id] = st;
				System.out.println("Student " + st.getName() + " "+ st.getSurname() + " was added");
			}

		}
		public void interfaceAdding() throws FullGroupException, StudentException {
			
			String name;
			String surname ;
			int age;
			String gender;
			int group;
			int grade;
			
			Scanner scan = new Scanner(System.in);
			
			
			 			    
			System.out.println("Enter studens Name: ");
			name= scan.nextLine();
			
			System.out.println("Enter studens Surname: ");
		    surname=scan.nextLine();
		    
		    System.out.println("Enter studens gender(male/female): ");
		    gender=scan.nextLine();
		    
		    System.out.println("Enter studens age: ");
		    age=scan.nextInt();
		    
		    System.out.println("Enter studens group number: ");
		    group=scan.nextInt();
		    
		    System.out.println("Enter studens averege grade:");
		    grade=scan.nextInt();
		    
		    
		   		       
		    
		    
		    
			
			
			
			Student student = new Student(name,surname,age,gender,group,grade);
							
			addingStud(student);
			
			
		}
			
		
		public void deleteStud (Student st) {
				for (int i=0;i<groupOfStudents.length;i++) {
					if (st.equals(groupOfStudents[i]) &&groupOfStudents!=null) {
						groupOfStudents[i]=null;
						System.out.println("Student " + st.getName()+ " " + st.getSurname()+ " was removed");
						return;
					}
				}
				System.out.println("Student " + st.getName() + " is not found");
			}
		
		
		public Student studentSearch( String surname) {
			Student tmp=null;
			for (int i=0; i<groupOfStudents.length;i++) {
				if(groupOfStudents[i]!=null) {
					if(groupOfStudents[i].getSurname().equals(surname)) {
						tmp=groupOfStudents[i];
						break;
							} else {
								
								System.out.println("Student " + surname + " is not found");
								break;
							}
						}
				} 
			
					return tmp;	
		}				
					
					
		
		 @Override
		    public String toString() throws NullPointerException {
		          int tmp =1;
		        for (int i = 0; i < groupOfStudents.length; i++) {
		       	if (groupOfStudents[i]==null) {
		       		  	continue;
		        } else {
		        System.out.println((tmp++) + " : " + groupOfStudents[i].toString());
		        		}
		       		}
		 		
		        	  return "";
		 }
		 @Override
			public Student[] toArmy() {
							Student[] over18 = new Student[10];
				for(int i = 0; i < over18.length; i++) {
					if(groupOfStudents[i]!=null) {
					if(groupOfStudents[i].getAge() >= 18 && groupOfStudents[i].getGender()!="female") {
						over18[i] = groupOfStudents[i];
						}
					}
				}
				return over18;
			}
		 
		 public void sortByParametr() {
				
				int tmp;
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter to sort by: \n 1- Surname \n 2 - Age \n 3 - Group number \n 4 - Averege grade"  );
				tmp=scan.nextInt();
				
				
				switch (tmp) {
				
				case 1:
					Arrays.sort(groupOfStudents, new StudSurnameComparator());
					break;
					
				case 2:
					Arrays.sort(groupOfStudents, new StudentAgeComparator());
					break;
								    
				case 3 :
					Arrays.sort(groupOfStudents, new StudentGroupComparator());
					break;
										
				case 4:
					Arrays.sort(groupOfStudents, new StudentGradeComprator());
					 break;
										
				}
		 }
	 
		 
		 
}

