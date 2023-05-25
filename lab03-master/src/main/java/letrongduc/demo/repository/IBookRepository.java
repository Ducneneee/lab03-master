package letrongduc.demo.repository;

import letrongduc.demo.enity.book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface IBookRepository extends JpaRepository<book, Long> {
}
