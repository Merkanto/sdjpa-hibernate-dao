package merkanto.sdjpahibernatedao.repositories;

import merkanto.sdjpahibernatedao.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
