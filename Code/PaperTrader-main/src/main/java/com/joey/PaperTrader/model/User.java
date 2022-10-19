package com.joey.PaperTrader.model;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Integer id;
    private String username;
    private String password;
    private Integer accountBalance;
    private Integer portfolioValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(Integer accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Integer getPortfolioValue() {
        return portfolioValue;
    }

    public void setPortfolioValue(Integer portfolioValue) {
        this.portfolioValue = portfolioValue;
    }
}
