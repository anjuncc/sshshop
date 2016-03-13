package a.j.shop.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *  只转发
 * @author anjun
 *
 */
public class SendAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String execute(){
		return "send";
	}
}
