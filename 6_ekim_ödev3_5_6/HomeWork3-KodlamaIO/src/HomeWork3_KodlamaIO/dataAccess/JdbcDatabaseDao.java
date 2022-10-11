package HomeWork3_KodlamaIO.dataAccess;

import HomeWork3_KodlamaIO.entities.Categories;
import HomeWork3_KodlamaIO.entities.Courses;
import HomeWork3_KodlamaIO.entities.Instructors;

public class JdbcDatabaseDao implements InstructorDao, CourseDao, CategoryDao {// JDBC Simulation
	Categories categories;
	Courses courses;
	Instructors instructors;

	@Override
	public void addCategory(Categories category) {

		System.out.println("Category added: " + '"' + category.getCategoryName() + '"' + " with JDBC");

	}

	@Override
	public void deleteCategory(Categories category) {
		System.out.println("Category deleted: " + '"' + category.getCategoryName() + '"' + " with JDBC");

	}

	@Override
	public void addCourse(Courses course) {
		System.out.println("Course added: " + '"' + course.getCourseName() + '"' + " with JDBC");

	}

	@Override
	public void deleteCourse(Courses course) {
		System.out.println("Course deleted: " + '"' + course.getCourseName() + '"' + " with JDBC");

	}

	@Override
	public void addInstructor(Instructors instructor) {
		System.out.println("Instructor added: " + '"' + instructor.getInstructorName() + '"' + " with JDBC");

	}

	@Override
	public void deleteInstructor(Instructors instructor) {
		System.out.println("Instructor deleted: " + '"' + instructor.getInstructorName() + '"' + " with JDBC");

	}

}
