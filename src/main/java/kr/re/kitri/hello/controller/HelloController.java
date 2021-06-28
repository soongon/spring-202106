package kr.re.kitri.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String sayHello() {
        return "안녕하세요, Hello World";
    }


    // 과제.. /posts/3  의 요청에 대해서 "3번 글 상세보기 입니다." 라는 응답을 주게 코드 작성

}
