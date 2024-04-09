package giuliochiarenza.esercizioU5W2D2.controllers;

import giuliochiarenza.esercizioU5W2D2.entities.Author;
import giuliochiarenza.esercizioU5W2D2.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @GetMapping
    private List<Author> getAllAuthor(){
        return this.authorService.getAuthorList();
    }
    @GetMapping("/{authorId}")
    private Author findByAuthorId(@PathVariable int authorId) {
        return this.authorService.findById(authorId);
    }
    @PostMapping
    private Author saveAuthor(@RequestBody Author body){
        return this.authorService.saveAuthor(body);
    }
    @PutMapping("/{authorId}")
    private Author findByIdAndUpdate(@PathVariable int authorId, @RequestBody Author body){
        return  this.authorService.findByIdAndUpdate(authorId, body);
    }
    @DeleteMapping("/{authorId}")
    private void findAuthorByIdAndDelete(@PathVariable int authorId){
        this.authorService.findByIdAndDelete(authorId);
    }
}
