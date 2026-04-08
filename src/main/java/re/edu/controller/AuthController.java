package re.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"loggedUser", "role"})
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        Model model) {

        if ((username.equals("admin") && password.equals("admin123")) ||
                (username.equals("staff") && password.equals("staff123"))) {

            model.addAttribute("loggedUser", username);
            model.addAttribute("role", username.equals("admin") ? "ADMIN" : "STAFF");

            return "redirect:/orders";
        }

        model.addAttribute("error", "Sai tài khoản!");
        return "login";
    }

    @GetMapping("/logout")
    public String logout(SessionStatus status) {
        status.setComplete();
        return "redirect:/login";
    }
}