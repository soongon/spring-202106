package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.PostRepository;
import kr.re.kitri.hello.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public String getAllPosts() {
        return postRepository.selectAllPosts();
    }
}
