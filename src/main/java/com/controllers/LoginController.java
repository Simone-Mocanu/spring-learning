package com.example.controllers;
import com.models.LoginModel;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {

  @GetMapping("/")
  public String displayLoginForm(Model model) {
    model.addAttribute("loginModel", new LoginModel());
    return "loginForm.html";
  }

  @PostMapping("/processLogin")
  public String processLogin(@Valid LoginModel loginModel,
                             BindingResult bindingResult, Model model) {
    // if validation errors try again.
    if (bindingResult.hasErrors()) {
      model.addAttribute("loginModel", loginModel);
      System.out.println("errors");
      return "loginForm.html";
    }
    System.out.println("no errors");
    model.addAttribute("loginModel", loginModel);
    return "loginResults.html";
  }
}
