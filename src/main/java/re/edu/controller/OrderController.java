package re.edu.controller;

import re.edu.model.Order;
import re.edu.sevice.GlobalCounter;
import re.edu.sevice.OrderService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class OrderController {

    private final OrderService service = new OrderService();

    @GetMapping("/orders")
    public String orders(
            @ModelAttribute(value = "loggedUser", binding = false) String user,
            @ModelAttribute(value = "role", binding = false) String role,
            Model model) {

        if (user == null) {
            return "redirect:/login";
        }

        List<Order> list = service.getOrders();
        model.addAttribute("orders", list);

        synchronized (GlobalCounter.class) {
            GlobalCounter.count++;
        }

        model.addAttribute("totalViewCount", GlobalCounter.count);

        return "orders";
    }
}