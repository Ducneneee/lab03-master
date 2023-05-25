package letrongduc.demo.repository;

import letrongduc.demo.enity.Category;
import letrongduc.demo.enity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository  extends JpaRepository<Category, Long> {
}
