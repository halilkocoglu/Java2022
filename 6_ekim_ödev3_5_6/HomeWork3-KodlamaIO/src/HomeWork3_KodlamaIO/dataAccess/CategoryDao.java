package HomeWork3_KodlamaIO.dataAccess;

import HomeWork3_KodlamaIO.entities.Categories;

public interface CategoryDao {// Data Access Object
	public void addCategory(Categories category);

	public void deleteCategory(Categories category);

}
