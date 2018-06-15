package com.qa.crud.repo;

import com.qa.crud.entity.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountRepository extends CrudRepository<Account, Integer> {

        Optional<Account> findBySecondName(String secondName);
}
