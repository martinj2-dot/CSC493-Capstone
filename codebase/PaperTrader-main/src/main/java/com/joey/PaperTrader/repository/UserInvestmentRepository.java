package com.joey.PaperTrader.repository;

import com.joey.PaperTrader.model.UserInvestment;
import org.springframework.data.repository.CrudRepository;

public interface UserInvestmentRepository extends CrudRepository<UserInvestment, Integer> {
}
