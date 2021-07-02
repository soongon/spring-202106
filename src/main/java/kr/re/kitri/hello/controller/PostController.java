package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    public static Logger logger =
            LoggerFactory.getLogger(PostController.class);

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public List<Post> viewAllPosts() {
        logger.debug("함수 호출 시작합니다.");
        return postService.getAllPosts();
    }

    @PostMapping("/posts")
    public void registPost(@RequestBody Post post) {
        postService.putPost(post);
    }

    @GetMapping("/posts/{postId}")
    public Post viewPostById(@PathVariable long postId) {
        System.out.println(postId);
        return null;
    }
}
