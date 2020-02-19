package com.wangwang.movie.web.front;

import com.wangwang.movie.po.Seat;
import com.wangwang.movie.po.Ticket;
import com.wangwang.movie.po.User;
import com.wangwang.movie.service.ShowMovieService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


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
                       @RequestParam("cid") Integer cid,
                       Model model){

        model.addAttribute("cname",name);
        model.addAttribute("show",showMovieService.getMovie(id));
        model.addAttribute("seat",showMovieService.getSeatForMovie(cid));
        model.addAttribute("seatJudge",showMovieService.getSeats(id,cid));
        return "seat";
    }
    @PostMapping("/ChoosenSeat")
    @ResponseBody
    public Boolean chooseSeat(@RequestParam Integer row, @RequestParam Integer col,
                              @RequestParam Integer mid,
                              HttpSession session){
        //System.out.println(row);
        User user = (User) session.getAttribute("user");
        Boolean flag = showMovieService.getTicketByUnique(row,col,mid,user.getId());
        if(flag){
            return false;
        }
        return true;
    }


}
