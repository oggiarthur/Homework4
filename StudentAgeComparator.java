package homeWork_4;

import java.util.Comparator;

public class StudentAgeComparator  implements Comparator<Student>{
		
		@Override
		public int compare(Student st1, Student st2) {
			if(st1==null|| st2==null) {
		        return -1;
		    }else {
		      return st1.getAge() - st2.getAge();
		}
		}
	}
