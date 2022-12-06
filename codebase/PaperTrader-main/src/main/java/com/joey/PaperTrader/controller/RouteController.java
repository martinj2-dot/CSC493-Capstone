package com.joey.PaperTrader.controller;
import com.joey.PaperTrader.model.User;
import com.joey.PaperTrader.model.UserInvestment;
import com.joey.PaperTrader.model.UserPortfolio;
import com.joey.PaperTrader.repository.UserInvestmentRepository;
import com.joey.PaperTrader.repository.UserPortfolioRepository;
import com.joey.PaperTrader.repository.UserRepository;
import com.joey.PaperTrader.repository.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static java.sql.DriverManager.println;

@Controller
public class RouteController {
    private final UserRepository userRepository;
    private final UserPortfolioRepository userPortfolioRepository;
    private final UserInvestmentRepository userInvestmentRepository;

    @Autowired
    public RouteController(UserRepository userRepository, UserPortfolioRepository userPortfolioRepository, UserInvestmentRepository userInvestmentRepository){
        this.userRepository = userRepository;
        this.userPortfolioRepository = userPortfolioRepository;
        this.userInvestmentRepository = userInvestmentRepository;
    }
    @RequestMapping(path = "/landing")
    public String loadLanding(){

        return "landing";
    }
    @RequestMapping(path = "/login")
    @ResponseBody
    public Map loadLogin(@RequestParam String email, @RequestParam String password){
        if(userRepository.existsByUsername(email)){
            if(UserService.getCache().isEmpty()){
                UserService.setCache("CurrentUser", email);
            }
            else {
                UserService.clearCache();
                UserService.setCache("CurrentUser", email);
            }
        }
        else {
            return UserService.getCache();
        }
        return UserService.getCache();
    }
    @RequestMapping(path= "/validateUser")
    @ResponseBody
    public List<User> getUser(){
        return (List<User>) userRepository.findAll();
    }

    @RequestMapping(path = "/retrieveUserPortfolio")
    @ResponseBody
    public List<UserPortfolio> retrieveUserPortfolio(){
        return (List<UserPortfolio>) userPortfolioRepository.findAll();
    }

    @RequestMapping(path = "/retrieveUserInvestments")
    @ResponseBody
    public List<UserInvestment> retrieveUserInvestments(){
        return (List<UserInvestment>) userInvestmentRepository.findAll();
    }

    @RequestMapping(path = "/buyStock", method = RequestMethod.POST)
    @ResponseBody
    public String buyStock(@RequestParam String stock, @RequestParam String quantity){

        return "Stock: "+ stock + " Quantity: " + quantity;
    }
    @RequestMapping(path="/investment")
    public String loadInvestment(){

        return "investment";
    }
    @RequestMapping(path= "/registerUser", method = RequestMethod.POST)
    @ResponseBody
    public String registerUser(@RequestBody Map<String, String> data){
       String userName = (data.get("userName"));
       println(data.get("email"));
       println(data.get("password"));
       
    return null;
    }
    @RequestMapping(path="/dashboard")
    public String getDashboard(){

        return "dashboard";
    }
}

