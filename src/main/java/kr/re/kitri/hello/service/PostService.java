package kr.re.kitri.hello.service;

import kr.re.kitri.hello.dao.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface PostService {
    String getAllPosts();
}
