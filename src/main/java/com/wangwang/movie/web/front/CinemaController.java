package com.wangwang.movie.web.front;

import com.wangwang.movie.service.CinemaService;
import com.wangwang.movie.service.ShowMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/cinema")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;

    @GetMapping("/detail")
    public String cinemaDetail(@RequestParam("id") Integer id, Model model){
        model.addAttribute("detail", cinemaService.getCinema(id));
        return "cinema-detail";
    }
}
