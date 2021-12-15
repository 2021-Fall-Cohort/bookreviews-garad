package org.wecancodeit.reviews.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.model.Book;
import org.wecancodeit.reviews.model.Genre;
import org.wecancodeit.reviews.repositories.BookRepository;
import org.wecancodeit.reviews.repositories.GenreRepository;

public class BookController {
    private BookRepository bookRepository;
    private GenreRepository genreRepository;

    public BookController(BookRepository bookRepository, GenreRepository genreRepository) {
        this.bookRepository = bookRepository;
        this.genreRepository = genreRepository;
    }

//    @RequestMapping("/books")
//    public String showReviews(Model model){
////        model.addAttribute("genre",genreRepository.findAll());
//        return "book";
//    }

    @RequestMapping("/books/{id}")
    public String showBook(Model model, @PathVariable long id){
        model.addAttribute("book",bookRepository.findById(id).get());
        return "book";
    }
//     @RequestMapping("/books/add")
//    public String addBook(@RequestParam String nameOfBook, @RequestParam String author, @RequestParam String publisher, @RequestParam String description,@RequestParam String ratingOfReviewer, @RequestParam String similarBooks, @RequestParam String imageUrl, @RequestParam String reviewBy, @RequestParam String review){
//         Genre genre = genreRepository.findByNameIgnoreCase(g);
//         Book newBook = new Book(nameOfBook,author,publisher,description,ratingOfReviewer,similarBooks,imageUrl,reviewBy,genre,review);
//         bookRepository.save(newBook);
//         return "redirect:/games/";
//     }
}
