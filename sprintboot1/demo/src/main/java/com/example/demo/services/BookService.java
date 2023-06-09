package com.example.demo.services;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> addNewBook(List<Book> newBook) {
        return bookRepository.saveAll(newBook);
    }

    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public List<Book> findBookByTitle(String title) {
        return bookRepository.findByTitleContainsIgnoreCase(title);
    }
}