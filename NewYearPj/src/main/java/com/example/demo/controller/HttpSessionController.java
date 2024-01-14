package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpSession;

@Controller
public class HttpSessionController {

	@RequestMapping(path = "/sessionlogin", method = RequestMethod.GET)
	public String first() {

		return "sessionlogin";
	}

	@RequestMapping(path = "/sessionlogin", method = RequestMethod.POST)
	public String second(String loginid, String password, HttpSession session) {

		//sessionに入力されたloginidを格納する。
		session.setAttribute("loginid", loginid);

		return "sessionhome";
	}

	@RequestMapping(path = "/sessionlogout", method = RequestMethod.GET)
	public String third(HttpSession session) {

		//セッションを破棄する前に中身を確認。
		String x = (String) session.getAttribute("loginid");

		System.out.println(x);

		//セッションにしまっていたものを破棄する。
		session.removeAttribute("loginid");

		return "sessionhome";
	}
}
