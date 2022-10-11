package HomeWork3_KodlamaIO.business;

import java.util.ArrayList;
import java.util.List;

import HomeWork3_KodlamaIO.core.logging.Logger;
import HomeWork3_KodlamaIO.dataAccess.CourseDao;
import HomeWork3_KodlamaIO.entities.Categories;
import HomeWork3_KodlamaIO.entities.Courses;

public class CoursesManager {
	private CourseDao courseDao;
	private Logger[] logger;
	private List<String> courseList = new ArrayList<String>();

	public CoursesManager(CourseDao courseDao, Logger[] logger) {
		this.courseDao = courseDao;
		this.logger = logger;
	}

	public void add(Courses course) throws Exception {
		boolean isOnTheList = false;
		boolean isPriceGreater = false;
		if (courseList.isEmpty()) { // array is empty or not?
			isOnTheList = false;
		} else {
			for (String courses : courseList) {
				if (course.getCourseName() == courses) {
					isOnTheList = true;
					break;
				}
			}
		}
		if (course.getCoursePrice() < 0) { // Price Prerequisite
			throw new Exception("The course price must be  greater than 0.");
		} else {
			if (isOnTheList == true) {
				throw new Exception("The Course you want to add is already exist.");
			} else {
				courseList.add(course.getCourseName());
				courseDao.addCourse(course);
			}
		}

		for (Logger logger2 : logger) {
			logger2.log("Course: " + course.getCourseName());
		}
	}

	public void delete(Courses course) throws Exception {
		boolean isOnTheList = false;
		if (courseList.isEmpty()) { // array is empty or not?
			isOnTheList = false;
		} else {
			for (String courses : courseList) {
				if (course.getCourseName() == courses) {
					isOnTheList = true;
					break;
				}
			}
		}
		if (isOnTheList == true) {
			courseList.remove(course.getCourseName());
			courseDao.deleteCourse(course);

		} else {
			throw new Exception("The Course " + '"' + course + '"' + " not found.");
		}
	}

	public List<String> getCourseList() {
		return courseList;
	}

}
