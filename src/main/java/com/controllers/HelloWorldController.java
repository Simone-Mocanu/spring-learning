package com.example.controllers;

import com.models.Person;
import java.util.ArrayList;
import java.util.List;
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

  @GetMapping("/people")
  public String showFriend(Model model) {
    List<Person> friends = new ArrayList<Person>();

    friends.add(new Person(0, "Allan", 23, 142.2f));
    friends.add(new Person(1, "Berry", 42, 220.2f));
    friends.add(new Person(2, "Carol", 71, 144.2f));
    friends.add(new Person(3, "Denise", 4, 38.2f));
    friends.add(new Person(4, "Esther", 19, 142.2f));

    System.out.println(friends);

    model.addAttribute("people", friends);
    return "printFriends";
  }

  @GetMapping("/peopleJSON")
  @ResponseBody
  public List<Person> showFriendsJSON(Model model) {
    List<Person> friends = new ArrayList<Person>();

    friends.add(new Person(0, "Allan", 23, 142.2f));
    friends.add(new Person(1, "Berry", 42, 220.2f));
    friends.add(new Person(2, "Carol", 71, 144.2f));
    friends.add(new Person(3, "Denise", 4, 38.2f));
    friends.add(new Person(4, "Esther", 19, 142.2f));

    System.out.println(friends);

    model.addAttribute("people", friends);
    return friends;
  }
}
