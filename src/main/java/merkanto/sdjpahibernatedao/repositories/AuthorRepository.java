package merkanto.sdjpahibernatedao.repositories;

import merkanto.sdjpahibernatedao.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
