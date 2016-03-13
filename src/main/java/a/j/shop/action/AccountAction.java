package a.j.shop.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

import a.j.shop.model.Account;
import a.j.shop.model.Category;
import a.j.shop.service.CategoryService;

public class AccountAction extends BaseAction<Account> {

	public String aindex(){
		return "aindex";
	}

	public String update() {
		System.out.println("___update-------");
		System.out
		.println(model);
		accountService.update(model);
		return "index";
	}

	public String save() {
		System.out.println("save---");
		return "index";
	}
	public String query() {
		System.out
				.println(ActionContext.getContext().getValueStack().getRoot());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		// ActionContext.getContext().put("categoryList",
		// categoryService.query());
		// ActionContext.getContext().getSession()
		// .put("categoryList", categoryService.query());
		// ActionContext.getContext().getApplication()
		// .put("categoryList", categoryService.query());

		request.put("categoryList", categoryService.query());
		session.put("categoryList", categoryService.query());
		application.put("categoryList", categoryService.query());
		System.out.println(model);
		System.out.println(accountService);
		return "index";
	}

}
