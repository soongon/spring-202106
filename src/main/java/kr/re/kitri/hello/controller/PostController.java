package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import kr.re.kitri.hello.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> viewAllPosts() {
        return postService.getAllPosts();
    }
}
