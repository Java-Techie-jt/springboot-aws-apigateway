package com.javatechie.aws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class AwsApigatewayExampleApplication {

    private List<Book> books = new ArrayList<>();

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        books.add(book);
        return book;
    }

    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    public static void main(String[] args) {
        SpringApplication.run(AwsApigatewayExampleApplication.class, args);
    }

}
