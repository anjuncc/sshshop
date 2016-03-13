package a.j.shop.action;

import java.util.HashMap;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import a.j.shop.model.Category;

@Controller
@Scope("prototype")
public class CategoryAction extends BaseAction<Category> {
	public String queryJoninAccount() {
		pageMap = new HashMap<>();
		System.out.println("type" + model.getType());
		List<Category> categoryList = categoryService.queryJoinAccount(
				model.getType(), page, rows);
		getPageMap().put("rows", categoryList);
		getPageMap().put("total", categoryService.getCount(model.getType()));
		return "jsonMap";
	}
	
}
