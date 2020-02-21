package com.wangwang.movie.web.front;

import com.wangwang.movie.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/mine")
public class UserController {

    @GetMapping("/wantSee")
    public String wantSee(Model model, HttpSession session){

        User user = (User) session.getAttribute("user");
        model.addAttribute("user",user);
        //System.out.println(user.getId());
        return "want";
    }
    @GetMapping("/hasSeen")
    public String hasSeen(Model model,HttpSession session){

        User user = (User) session.getAttribute("user");
        model.addAttribute("user",user);
        //System.out.println(user.getId());
        return "watched";
    }
}
