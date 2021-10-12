package com.mateusz.project.infrastructure.web.book;

import com.mateusz.project.domain.BookDto;
import com.mateusz.project.domain.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String getList(Model model) {
        var BookDtoList = service.getAll();
        model.addAttribute("books", BookDtoList);
        return "list";
    }

    @PostMapping("/add")
    public String processForm(@ModelAttribute BookDto book){
        System.out.println(book);
        service.addBook(book);
        return "result";
    }

}
