package com.tmCraftgruz.SearchPanel.controller;

import com.tmCraftgruz.SearchPanel.entity.UsersAppEntity;
import com.tmCraftgruz.SearchPanel.service.UsersAppService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserAppController {


    @Autowired
    private UsersAppService usersAppService;


    @GetMapping("/welcome")
    public String add() {
        return "user-add-from-form";
    }
    @PostMapping("/welcome/add")
    public String add(@RequestParam String login,
                      @RequestParam String password,
                      @RequestParam String role) {
        UsersAppEntity entity = new UsersAppEntity(
                login, new BCryptPasswordEncoder().encode(password), role);
        usersAppService.add(entity);
        return "redirect:/user/welcome";
    }

    @PostMapping("/delete")
    public String delete(){
        usersAppService.delete();
        return "redirect:/user/welcome";
    }
}
