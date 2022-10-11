package HomeWork3_KodlamaIO.dataAccess;

import HomeWork3_KodlamaIO.entities.Courses;

public interface CourseDao {// Data Access Object
	public void addCourse(Courses course);

	public void deleteCourse(Courses course);

}
