package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

    @RequestMapping("home")
    // @ResponseBody
    public String home(HttpServletRequest req){
        HttpSession session=req.getSession();
        String name=req.getParameter("name");
        System.out.println("this is homepage : " + name);
        session.setAttribute("name", name);
        return "home.jsp";
    }
}
