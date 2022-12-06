package com.joey.PaperTrader.model;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "user_investment")
public class UserInvestment {
    @Id private Integer investment_id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @NotNull
    private User user_id;
    private String investment;
    private Integer quantity;

    public Integer getInvestment_id() {return investment_id;}

    public void setInvestment_id(Integer investment_id) {this.investment_id = investment_id;}

    public User getUser_id() {return user_id;}

    public void setUser_id(User user_id) {this.user_id = user_id;}

    public String getInvestment() {return investment;}

    public void setInvestment(String investment) {this.investment = investment;}

    public Integer getQuantity() {return quantity;}

    public void setQuantity(Integer quantity) {this.quantity = quantity;}
}
