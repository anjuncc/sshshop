package a.j.shop.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 *  只转发
 * @author anjun
 *
 */
@Controller
public class SendAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute(){
		return "send";
	}
}
