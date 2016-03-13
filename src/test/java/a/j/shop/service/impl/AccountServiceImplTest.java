package a.j.shop.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import a.j.shop.model.Account;
import a.j.shop.service.AccountService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-public.xml",
		"classpath:applicationContext-service.xml",
		"classpath:applicationContext-action.xml" })
public class AccountServiceImplTest {
@Resource
AccountService accountService;
	@Test
	public final void testSave() {
		accountService.save(new Account("admin","admin","admin"));
	}

}
