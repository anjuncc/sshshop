package a.j.shop.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import a.j.shop.model.Account;
import a.j.shop.service.AccountService;
import a.j.shop.utils.HibernateSessionFactory;

public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService {
	 public AccountServiceImpl(){
		super();
	}
}
