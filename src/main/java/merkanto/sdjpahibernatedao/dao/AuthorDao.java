package merkanto.sdjpahibernatedao.dao;

import merkanto.sdjpahibernatedao.domain.Author;

public interface AuthorDao {
    Author getById(Long id);

    Author findAuthorByName(String firstName, String lastName);

    Author saveNewAuthor(Author author);

    Author updateAuthor(Author author);

    void deleteAuthorById(Long id);
}
