package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Post;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PostRepository {

    public List<Post> selectAllPosts() {
        // 실제 DB와 접속해서 모든 글들을 가져오는 코드..
        List<Post> list = List.of(
                new Post(1, "첫번째 글", "김순곤", "오늘은 좋은날", 10),
                new Post(2, "두번째 글", "김순곤", "오늘은 좋은날", 10),
                new Post(3, "세번째 글", "김순곤", "오늘은 좋은날", 10),
                new Post(4, "네번째 글", "김순곤", "오늘은 좋은날", 10),
                new Post(5, "다섯번째 글", "김순곤", "오늘은 좋은날", 10)
        );
        return list;
    }

    public void insertPost(Post post) {
        // DB 에 insert...
        System.out.println("인서트 완료.." + post);
    }
}
