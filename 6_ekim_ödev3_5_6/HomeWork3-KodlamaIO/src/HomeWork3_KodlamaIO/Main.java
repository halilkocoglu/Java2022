package HomeWork3_KodlamaIO;

import java.util.ArrayList;
import java.util.List;
import HomeWork3_KodlamaIO.business.CategoriesManager;
import HomeWork3_KodlamaIO.business.CoursesManager;
import HomeWork3_KodlamaIO.business.InstructorsManager;
import HomeWork3_KodlamaIO.core.logging.DatabaseLogger;
import HomeWork3_KodlamaIO.core.logging.FileLogger;
import HomeWork3_KodlamaIO.core.logging.Logger;
import HomeWork3_KodlamaIO.core.logging.MailLogger;
import HomeWork3_KodlamaIO.dataAccess.HibernateDatabaseDao;
import HomeWork3_KodlamaIO.dataAccess.JdbcDatabaseDao;
import HomeWork3_KodlamaIO.entities.Categories;
import HomeWork3_KodlamaIO.entities.Courses;
import HomeWork3_KodlamaIO.entities.Instructors;

public class Main {

	public static void main(String[] args) throws Exception {

		Categories category1 = new Categories();
		Instructors instructor1 = new Instructors();
		Courses course1 = new Courses();

		category1.setCategoryName("Software"); // Entities (Setters and Getters)
		instructor1.setInstructorName("Engin Demirog");

		course1.setCourseName("Java 2022");
		course1.setCoursePrice(0);

		Instructors instructor2 = new Instructors();
		instructor2.setInstructorName("M.Murat Coskun");

		Categories category2 = new Categories();
		category2.setCategoryName("Algorithm");

		Courses course2 = new Courses();
		course2.setCourseName("C#");
		course2.setCoursePrice(9.99);

		Logger[] loggers = { new DatabaseLogger(), new FileLogger() };// new DatabaseLogger(),new FileLogger(),new
																		// MailLogger()

		CategoriesManager categoriesManager = new CategoriesManager(new JdbcDatabaseDao(), loggers);
		CoursesManager coursesManager = new CoursesManager(new HibernateDatabaseDao(), loggers);
		InstructorsManager instructorsManager = new InstructorsManager(new JdbcDatabaseDao(), loggers);

		categoriesManager.add(category1); // Business Methods
		coursesManager.add(course1);
		instructorsManager.add(instructor1);

		categoriesManager.add(category2);
		instructorsManager.add(instructor2);
		coursesManager.add(course2);

//		instructorsManager.delete(instructor2);
//		categoriesManager.delete(category2);
//		coursesManager.delete(course1);
//		coursesManager.delete(course2);

		System.out.println("Category List: " + categoriesManager.getCategoryList());
		System.out.println("Course List: " + coursesManager.getCourseList());
		System.out.println("Instructor List: " + instructorsManager.getInstructorList());

	}

}
