package local.Test.School.api;

import java.util.List;

import local.Test.School.model.Performance;
import local.Test.School.model.SchoolClass;
import local.Test.School.model.Student;

public interface MusicSchoolOrganizer {
	void addNewStudent(Student student, SchoolClass schoolClass);
	
	void deleteStudentFromClass(Student student, SchoolClass schoolClass);
	
	List<Student> getAllStudents();
	
	List<Student> getStudentsFromClass(SchoolClass schoolClass);
	
	void schedulePerformance(Performance performance);

}
