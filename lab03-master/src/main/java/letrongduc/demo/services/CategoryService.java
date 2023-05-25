package letrongduc.demo.services;

import letrongduc.demo.enity.Category;
import letrongduc.demo.enity.book;
import letrongduc.demo.repository.IBookRepository;
import letrongduc.demo.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import letrongduc.demo.repository.ICategoryRepository;
@Service
public class CategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    public Category getCategoryById(Long id){
        return categoryRepository.findById(id).orElse(null);
    }
    public Category saveCategory(Category category){
        return categoryRepository.save(category);
    }
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
