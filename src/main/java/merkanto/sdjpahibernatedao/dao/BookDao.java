package merkanto.sdjpahibernatedao.dao;

import merkanto.sdjpahibernatedao.domain.Book;

public interface BookDao {

    Book findByISBN(String isbn);

    Book getById(Long id);

    Book findBookByTitle(String title);

    Book saveNewBook(Book book);

    Book updateBook(Book book);

    void deleteBookById(Long id);

}