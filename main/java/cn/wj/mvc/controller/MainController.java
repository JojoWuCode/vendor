package cn.wj.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ThinkPad on 2017/4/8.
 */
@Controller
@RequestMapping("/mvc")
public class MainController {
	/**
	 * 行为日志列表
	 * @return
	 */
	@RequestMapping(value = "/listActionLog",method =  RequestMethod.GET)
	public String listActionLog(){
		return "list_action_log";
	}

	/**
	 * 项目框架测试
	 * @return
	 */
	@RequestMapping(value = "/hello",method =  RequestMethod.GET)
	public String hello(){
		return "Hello Controller";
	}

	/**
	 * 登录界面
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public  String login(){
		return "login";
	}

	/**
	 * 注册界面
	 * @return
	 */
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public  String register(){
		return "login";
	}



	/**
	 * 后台主页
	 * @return
	 */
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String home(){
		return "home";
	}

	///**
	// * 修改个人资料
	// * @return
	// */
	//@RequestMapping(value = "/update.do",method = RequestMethod.GET)
	//public  String update(){
	//	return "home";
	//}


}
