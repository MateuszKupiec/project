package com.mateusz.project.domain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookService {

    BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }


    public List<BookDto> getAll() {
        return repository.findAll().stream()
                .map(book -> new BookDto(book.getTitle(), book.getAuthor())).collect(Collectors.toList());
    }

    public void addBook(BookDto bookDto){
        var book = new Book(bookDto.getTitle(), bookDto.getAuthor());
        repository.save(book);
    }
}
