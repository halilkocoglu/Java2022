package HomeWork3_KodlamaIO.dataAccess;

import HomeWork3_KodlamaIO.entities.Categories;
import HomeWork3_KodlamaIO.entities.Courses;
import HomeWork3_KodlamaIO.entities.Instructors;

public class HibernateDatabaseDao implements InstructorDao, CourseDao, CategoryDao {// Hibernate Simulation

	@Override
	public void addCategory(Categories category) {
		System.out.println("Category added: " + '"' + category.getCategoryName() + '"' + " with Hibernate");

	}

	@Override
	public void deleteCategory(Categories category) {
		System.out.println("Category deleted: " + '"' + category.getCategoryName() + '"' + " with Hibernate");

	}

	@Override
	public void addCourse(Courses course) {
		System.out.println("Course added: " + '"' + course.getCourseName() + '"' + " with Hibernate");

	}

	@Override
	public void deleteCourse(Courses course) {
		System.out.println("Course deleted: " + '"' + course.getCourseName() + '"' + " with Hibernate");

	}

	@Override
	public void addInstructor(Instructors instructor) {
		System.out.println("Instructor added: " + '"' + instructor.getInstructorName() + '"' + " with Hibernate");

	}

	@Override
	public void deleteInstructor(Instructors instructor) {
		System.out.println("Instructor deleted: " + '"' + instructor.getInstructorName() + '"' + " with Hibernate");

	}

}
