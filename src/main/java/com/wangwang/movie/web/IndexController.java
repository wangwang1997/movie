package com.wangwang.movie.web;


import com.wangwang.movie.po.Cinema;
import com.wangwang.movie.service.CinemaService;
import com.wangwang.movie.service.ShowMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.data.domain.Pageable;


@Controller

public class IndexController {

    @Autowired
    private ShowMovieService showMovieService;
    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/")
    public String index(@PageableDefault(size = 6,sort = {"id"},direction = Sort.Direction.DESC
    ) Pageable pageable, Model model){

        model.addAttribute("page",showMovieService.listShow(pageable));


        return "index";
    }




    @GetMapping("/cinema")
    public String cinema(@PageableDefault(size = 6,sort = {"id"},direction = Sort.Direction.DESC
    ) Pageable pageable,Model model){
        model.addAttribute("cinema",cinemaService.listCinema(pageable));
        return "cinema";
    }



    @GetMapping("/mine")
    public String mine(){
        return "mine";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }


    @GetMapping("/seat")
    public String seat(){
        return "seat";
    }
}
