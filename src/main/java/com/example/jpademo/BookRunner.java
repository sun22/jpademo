package com.example.jpademo;

import com.example.jpademo.book.Book;
import com.example.jpademo.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class BookRunner implements ApplicationRunner {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) {
        Book book = new Book();
        book.setName("jpa book");
        book.setCreated(new Date());

        bookRepository.save(book);
    }
}
