package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.springframework.stereotype.Repository;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepository {

    public List<Post> selectAllPosts() {
        return null;
    }

    public void insertPost(Post post) {
        // DB 에 insert...
        System.out.println("인서트 완료.." + post);
    }
}
