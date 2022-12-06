package com.joey.PaperTrader.model;
import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_portfolio")
public class UserPortfolio {
    @Id private Integer portfolio_id;
    @OneToOne
    @JoinColumn(name="user_id")
    @NotNull
    private User user_id;
    private Integer balance;


    public Integer getPortfolio_id(){
        return  portfolio_id;
    }

    public void setPortfolio_id(Integer id){
        this.portfolio_id = id;
    }

    public User getUser_id(){return user_id;}

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }
}
