package HomeWork3_KodlamaIO.business;

import java.util.ArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import HomeWork3_KodlamaIO.core.logging.Logger;
import HomeWork3_KodlamaIO.dataAccess.InstructorDao;
import HomeWork3_KodlamaIO.entities.Instructors;

public class InstructorsManager {
	private InstructorDao instructorDao;
	private Logger[] logger;
	private List<String> instructorList = new ArrayList<String>();

	public InstructorsManager(InstructorDao instructorDao, Logger[] logger) {
		this.instructorDao = instructorDao;
		this.logger = logger;
	}

	public void add(Instructors instructor) throws Exception {
		boolean isOnTheList = false;
		if (instructorList.isEmpty()) { // array is empty or not?
			isOnTheList = false;
		} else {
			for (String instructors : instructorList) {
				if (instructor.getInstructorName() == instructors) {
					isOnTheList = true;
					break;
				}
			}
		}
		if (isOnTheList == true) {
			throw new Exception("The instructor you want to add is already exist.");
		} else {
			instructorList.add(instructor.getInstructorName());
			instructorDao.addInstructor(instructor);
		}

		for (Logger logger2 : logger) {
			logger2.log("Instructor: " + instructor.getInstructorName());
		}

	}

	public void delete(Instructors instructor) throws Exception {
		boolean isOnTheList = false;
		if (instructorList.isEmpty()) { // array is empty or not?
			isOnTheList = false;
		} else {
			for (String instructors : instructorList) {
				if (instructor.getInstructorName() == instructors) {
					isOnTheList = true;
					break;
				}
			}
		}
		if (isOnTheList == true) {
			instructorList.remove(instructor.getInstructorName());
			instructorDao.deleteInstructor(instructor);

		} else {
			throw new Exception("The Instructor " + '"' + instructor + '"' + " not found.");
		}
	}

	public List<String> getInstructorList() {
		return instructorList;
	}
}
