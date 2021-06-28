package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public String getAllPosts() {
        return postRepository.selectAllPosts();
    }
}
