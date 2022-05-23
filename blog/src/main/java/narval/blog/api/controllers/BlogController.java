package narval.blog.api.controllers;

import narval.blog.business.abstracts.BlogService;
import narval.blog.core.utilities.results.DataResult;
import narval.blog.core.utilities.results.Result;
import narval.blog.core.utilities.results.SuccessDataResult;
import narval.blog.entities.concretes.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.util.List;

@RestController
@RequestMapping("/api/blogs")
public class BlogController {

    private BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @GetMapping("/getall")
    public DataResult<List<Blog>> getAll() {
        return this.blogService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Blog blog){
    return this.blogService.add(blog);
    }

    @GetMapping("/getbyid")
    public DataResult<Blog> getById(@RequestParam int id){
        return this.blogService.getById(id);
    }

}