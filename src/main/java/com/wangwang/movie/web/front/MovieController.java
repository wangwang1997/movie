package com.wangwang.movie.web.front;

import com.wangwang.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/future")
    public String future(@PageableDefault(size = 10,sort = {"showTime"},direction = Sort.Direction.DESC)
                                 Pageable pageable, Model model){
        model.addAttribute("coming",movieService.listMovie(pageable));
        return "film-future";
    }



}
