package HomeWork3_KodlamaIO.dataAccess;

import HomeWork3_KodlamaIO.entities.Instructors;

public interface InstructorDao {// Data Access Object
	public void addInstructor(Instructors instructor);

	public void deleteInstructor(Instructors instructor);
}
