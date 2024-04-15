package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

  @GetMapping("/test1")
  @ResponseBody
  public String printHelloWorld() {
    return "Hello World!";
  }

  @GetMapping("/test2")
  public String showHelloPage(Model m) {
    m.addAttribute("message", "have a wonderful day!");
    m.addAttribute("rating", 99);
    m.addAttribute("report", "some great news from the station.");
    return "helloPage"; // you can add the .html as well
  }

  @GetMapping("/test3")
  public ModelAndView printHello() {
    ModelAndView mv = new ModelAndView();
    mv.addObject("message", "have a super day");
    mv.addObject("rating", 55);
    mv.setViewName("helloPage");
    return mv;
  }

  @GetMapping("/test4")
  public String showHelloPage4(@RequestParam("num1") String num1,
                               @RequestParam("num2") String num2, Model m) {
    int result = Integer.valueOf(num1) + Integer.valueOf(num2);

    m.addAttribute("num1", num1);
    m.addAttribute("num2", num2);
    m.addAttribute("result", String.valueOf(result));
    return "testPage"; // you can add the .html as well
  }
}
