package com.hr.springboot5.controller;

import com.hr.springboot5.entity.Author;
import com.hr.springboot5.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/AuthorController")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        System.out.println("进了controller");
        ModelAndView mv=new ModelAndView("/list");
        mv.addObject("list",authorService.findAll());
        return mv;
    }
    @RequestMapping("/save")
    public ModelAndView save(Integer id){
        System.out.println(id);
        ModelAndView mv=new ModelAndView("/update");
        mv.addObject("author",authorService.findById(id));
        return mv;
    }
    @RequestMapping("/update")
    public ModelAndView update(Author author){
        System.out.println(author);
        //ModelAndView mv=new ModelAndView("/update");
        int update = authorService.update(author);
        if(update>0){
            System.out.println("修改成功");
        }
        return null;
    }
}
