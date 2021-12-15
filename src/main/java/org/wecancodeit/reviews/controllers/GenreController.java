package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.repositories.BookRepository;
import org.wecancodeit.reviews.repositories.GenreRepository;

@Controller
public class GenreController {
    private BookRepository bookRepository;
    private GenreRepository genreRepository;

    public GenreController(BookRepository bookRepository, GenreRepository genreRepository) {
        this.bookRepository = bookRepository;
        this.genreRepository = genreRepository;
    }

    @RequestMapping("/genres")
    public String getGenre(Model model){
        model.addAttribute("genres",genreRepository.findAll());
        return "genresView";
    }

    @RequestMapping("/genres/{id}")
    public String showGenre(Model model, @PathVariable long id){
        model.addAttribute("genre",genreRepository.findById(id).get());
        return "books";
    }

//    @RequestMapping("/genre/{name}")
//    public String showGenre(Model model, @PathVariable String name){
//        model.addAttribute("genre",genreRepository.findByNameIgnoreCase(name));
//        return "genre";
//    }
}
