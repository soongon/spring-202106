package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.PostRepository;
import kr.re.kitri.hello.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();
    void putPost(Post post);
    Post getPostById(long userId);
}
