package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostRepositoryTests {

    @Autowired
    private PostRepository postRepository;

    @Test
    public void testSelectAllPosts() {
        List<Post> list = postRepository.selectAllPosts();
        Assertions.assertEquals(1, list.get(0).getPostId());
    }
    @Test
    public void testInsertPost() {
        Post post = new Post(10000, "aaa", "bbbb", "ccc", 111);
        postRepository.insertPost(post);
    }
    @Test
    public void testSelectPostById() {
        Post post = postRepository.selectPostById(1);
        Assertions.assertEquals("kim", post.getAuthor());
    }
}
