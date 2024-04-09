package giuliochiarenza.esercizioU5W2D2.controllers;


import giuliochiarenza.esercizioU5W2D2.entities.Blog;
import giuliochiarenza.esercizioU5W2D2.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping
    private List<Blog> getAllBlog(){
        return this.blogService.getBlogList();
    }
    @GetMapping("/{blogId}")
    private Blog findByBlogId(@PathVariable int blogId) {
        return this.blogService.findById(blogId);
    }
    @PostMapping
    private Blog saveBlog(@RequestBody Blog body){
        return this.blogService.saveBlog(body);
    }
    @PutMapping("/{blogId}")
    private Blog findByIdAndUpdate(@PathVariable int blogId, @RequestBody Blog body){
        return  this.blogService.findByIdAndUpdate(blogId, body);
    }
    @DeleteMapping("/{blogId}")
    private void findBlogByIdAndDelete(@PathVariable int blogId){
        this.blogService.findByIdAndDelete(blogId);
    }
}
