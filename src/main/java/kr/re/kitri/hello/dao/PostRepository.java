package kr.re.kitri.hello.dao;

import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {

    public String selectAllPosts() {
        // 실제 DB와 접속해서 모든 글들을 가져오는 코드..
        return "모든 글을 반환합니다.";
    }
}
