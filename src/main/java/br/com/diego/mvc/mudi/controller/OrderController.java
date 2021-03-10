package br.com.diego.mvc.mudi.controller;

import br.com.diego.mvc.mudi.dto.RequestOrder;
import br.com.diego.mvc.mudi.model.Order;
import br.com.diego.mvc.mudi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("create")
    public String create() {
        return "order/create";
    }

    @PostMapping("save")
    public String save(RequestOrder request) {
        Order order = request.toOrder();
        orderRepository.save(order);

        return "order/create";
    }
}
