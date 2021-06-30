package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface PostRepository {
    List<Post> selectAllPosts();
    void insertPost(Post post);
    Post selectPostById(long userId);
}
