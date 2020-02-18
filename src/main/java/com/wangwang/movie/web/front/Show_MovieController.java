package com.wangwang.movie.web.front;

import com.wangwang.movie.service.ShowMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/show")
public class Show_MovieController {

    @Autowired
    private ShowMovieService showMovieService;


    @GetMapping("/detail")
    public String detail(@RequestParam("id") Integer id, Model model){
        model.addAttribute("detail", showMovieService.getMovie(id));
        return "film-detail";
    }
}
