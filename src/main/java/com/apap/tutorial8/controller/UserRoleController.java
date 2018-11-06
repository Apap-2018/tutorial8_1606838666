package com.apap.tutorial8.controller;

import com.apap.tutorial8.model.UserRoleModel;
import com.apap.tutorial8.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserRoleController {
    @Autowired
    private UserRoleService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    private String addUserSubmit(@ModelAttribute UserRoleModel user) {
        userService.addUser(user);
        return "home";
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    private String updatePasswordSubmit(
            @RequestParam("passwordLama") String passwordLama,
            @RequestParam("passwordBaru") String passwordBaru,
            @RequestParam("passwordBaruKonfirmasi") String passwordBaruKonfirmasi
            ) {

        return "home";
    }
}
