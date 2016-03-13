package a.j.shop.service.impl;

import org.springframework.stereotype.Service;

import a.j.shop.model.Account;
import a.j.shop.service.AccountService;
@Service("accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {
	 public AccountServiceImpl(){
		super();
	}
}
