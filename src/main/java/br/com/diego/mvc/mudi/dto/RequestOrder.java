package br.com.diego.mvc.mudi.dto;

import br.com.diego.mvc.mudi.model.Order;

public class RequestOrder {

    private String orderName;
    private String orderUrl;
    private String orderImage;
    private String description;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public String getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(String orderImage) {
        this.orderImage = orderImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Order toOrder() {
        Order order = new Order();
        order.setOrderName(orderName);
        order.setOrderUrl(orderUrl);
        order.setOrderImage(orderImage);
        order.setDescription(description);

        return order;
    }
}
