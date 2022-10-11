package HomeWork3_KodlamaIO.business;

import java.util.ArrayList;
import java.util.List;

import HomeWork3_KodlamaIO.core.logging.Logger;
import HomeWork3_KodlamaIO.dataAccess.CategoryDao;
import HomeWork3_KodlamaIO.entities.Categories;
import HomeWork3_KodlamaIO.entities.Instructors;

public class CategoriesManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<String> categoryList = new ArrayList<String>();

	public CategoriesManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;

	}

	public void add(Categories category) throws Exception {
		boolean isOnTheList = false;
		if (categoryList.isEmpty()) { // array is empty or not?
			isOnTheList = false;
		} else {
			for (String categories : categoryList) {
				if (category.getCategoryName() == categories) {
					isOnTheList = true;
					break;
				}
			}
		}
		if (isOnTheList == true) {
			throw new Exception("The category you want to add is already exist.");
		} else {
			categoryList.add(category.getCategoryName());
			categoryDao.addCategory(category);
		}

		for (Logger logger : loggers) { // Logger
			logger.log("Category: " + category.getCategoryName());
		}

	}

	public void delete(Categories category) throws Exception {
		boolean isOnTheList = false;
		if (categoryList.isEmpty()) { // array is empty or not?
			isOnTheList = false;
		} else {
			for (String categories : categoryList) {
				if (category.getCategoryName() == categories) {
					isOnTheList = true;
					break;
				}
			}
		}
		if (isOnTheList == true) {
			categoryList.remove(category.getCategoryName());
			categoryDao.deleteCategory(category);

		} else {
			throw new Exception("The Category " + '"' + category + '"' + " not found.");
		}
	}

	public List<String> getCategoryList() {
		return categoryList;
	}

}
