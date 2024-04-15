package com.models;

public class LoginModel {

  private String username;
  private String password;

  public LoginModel() { super(); }

  @Override
  public String toString() {
    return "LoginModel (username: " + username + ", password: " + password +
        ")";
  }

  public String getUsername() { return username; }

  public void setUsername(String username) { this.username = username; }

  public String getPassword() { return password; }

  public void setPassword(String password) { this.password = password; }

  // UserModel would have:
  // firstName, lastName, address, roles, email, etc..
}
