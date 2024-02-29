package jpabook.jpashop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    //전체 검색 -> 커맨드 + 쉬프트 + F
    //옵션 + 엔터 -> 코드 간단 수정
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("data","hello");
        return "hello";
    }
}
