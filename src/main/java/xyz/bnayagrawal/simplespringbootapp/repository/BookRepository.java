package xyz.bnayagrawal.simplespringbootapp.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.simplespringbootapp.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
