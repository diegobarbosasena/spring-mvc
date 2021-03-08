package br.com.diego.mvc.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Order {

    private String orderName;
    private BigDecimal negotiatedValue;
    private LocalDate deliveryDate;
    private String orderUrl;
    private String orderImage;
    private String description;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public BigDecimal getNegotiatedValue() {
        return negotiatedValue;
    }

    public void setNegotiatedValue(BigDecimal negotiatedValue) {
        this.negotiatedValue = negotiatedValue;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
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
}
