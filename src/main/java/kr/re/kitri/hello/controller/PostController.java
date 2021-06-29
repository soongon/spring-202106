package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import kr.re.kitri.hello.service.impl.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> viewAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/posts")
    public void registPost(@RequestBody Post post) {
        postService.putPost(post);
    }
}
