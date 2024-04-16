package com.example.controllers;
import com.models.LoginModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
  public String processLogin(LoginModel loginModel, Model model) {
    model.addAttribute("loginModel", loginModel);
    return "loginResults.html";
  }
}
