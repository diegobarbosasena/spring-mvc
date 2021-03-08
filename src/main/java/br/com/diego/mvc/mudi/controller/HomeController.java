package br.com.diego.mvc.mudi.controller;

import br.com.diego.mvc.mudi.model.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {

        Order order = new Order();
        order.setOrderName("Desbravando Java e Orientação a Objetos ");
//        order.setNegotiatedValue(59.00);
//        order.setDeliveryDate();
        order.setOrderUrl("https://www.casadocodigo.com.br/products/livro-orientacao-objetos-java");
        order.setOrderImage("https://cdn.shopify.com/s/files/1/0155/7645/products/orientacao-objetos-java-featured_large.png?v=1416402140");
        order.setDescription("Aprenda Orientação a Objetos com Java de forma simples e efetiva! Você compilará e executará seu próprio programa em algumas horas. Por que Java? Essa é uma das linguagens de programação mais utilizadas em todo o mundo, com 20 anos e atualmente mais de 9 milhões de desenvolvedores. ");

        List<Order> orders = Arrays.asList(order);
        model.addAttribute("orders", orders);

        return "home";
    }
}
