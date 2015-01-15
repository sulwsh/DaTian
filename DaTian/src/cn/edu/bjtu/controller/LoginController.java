package cn.edu.bjtu.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.edu.bjtu.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	/*@RequestMapping(value="/login")//���Ǻ�׺Ϊlogin������ִ�д˷���
	public String showHomePage(Map<String,Object> model)//Ҳ���Դ���request�Ȳ���
	{
		
		model.put("name", "iver99");
		
		//�˴�����ҵ���߼�����룬���ú����DAO�㣬�������ݿ�ȵȣ�ʡ��
		
		return "success";//����һ����ͼ���ַ������ƣ�����ͼ��������Ⱦҳ��
	}*/
	@RequestMapping(value="/login")
	public ModelAndView loginAction(HttpServletRequest request)
	{
		String name=request.getParameter("username");//��ҳ���ȡusername
		ModelAndView mv=new ModelAndView();
		//System.out.println(name);
		mv.addObject("name",name);
		mv.setViewName("success");
		return mv;
		
	}
}