package kr.re.kitri.hello.service.impl;

import kr.re.kitri.hello.dao.PostRepository;
import kr.re.kitri.hello.model.Post;
import kr.re.kitri.hello.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    public static Logger logger =
            LoggerFactory.getLogger(PostServiceImpl.class);

    @Autowired private PostRepository postRepository;
//    @Autowired private UserRepository userRepository;
//    @Autowired private CouponRepository userRepository;
//    @Autowired private DeliveryRepository userRepository;
//    @Autowired private MailRepository userRepository;

    @Override
    @Transactional
    public List<Post> getAllPosts() {
        logger.debug("hhhhhsdfsdf");
        return postRepository.selectAllPosts();
    }

    @Override
    public void putPost(Post post) {
        postRepository.insertPost(post);
    }

    @Override
    public Post getPostById(long userId) {
        return postRepository.selectPostById(userId);
    }
}
