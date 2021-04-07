package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private AuthorRepository repository;


    public AuthorController(AuthorRepository repository) {
        this.repository = repository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("author", repository.findAll());

        return "authors/list";
    }
}
