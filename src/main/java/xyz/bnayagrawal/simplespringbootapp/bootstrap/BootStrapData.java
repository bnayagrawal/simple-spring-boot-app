package xyz.bnayagrawal.simplespringbootapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import xyz.bnayagrawal.simplespringbootapp.model.Book;
import xyz.bnayagrawal.simplespringbootapp.repository.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {

    private final BookRepository bookRepository;

    public BootStrapData(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book = new Book();
        book.setTitle("My Book 0");
        book.setAuthor("My Author 0");
        bookRepository.save(book);

        Book book1 = new Book();
        book1.setTitle("My Book 1");
        book1.setAuthor("My Author 1");
        bookRepository.save(book1);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
    }
}

