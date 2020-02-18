package com.wangwang.movie.web.front;

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
@RequestMapping("/show")
public class Show_MovieController {

    @Autowired
    private ShowMovieService showMovieService;


    @GetMapping("/detail")
    public String detail(@RequestParam("id") Integer id, Model model){
        model.addAttribute("detail", showMovieService.getMovie(id));
        return "film-detail";
    }
    @GetMapping("/target")
    public String cinemaTarget(@PageableDefault(size = 6,sort = {"id"},direction = Sort.Direction.DESC
    ) Pageable pageable, Model model, @RequestParam("id") Integer id){

        model.addAttribute("cinema",showMovieService.getCinemasById(id,pageable));
        model.addAttribute("show",showMovieService.getMovie(id));
        return "target";
    }
    @GetMapping("/seat")
    public String seat(@RequestParam("name") String name,
                       @RequestParam("mid") Integer id,
                       Model model){
        model.addAttribute("cname",name);
        model.addAttribute("show",showMovieService.getMovie(id));
        return "seat";
    }
}
