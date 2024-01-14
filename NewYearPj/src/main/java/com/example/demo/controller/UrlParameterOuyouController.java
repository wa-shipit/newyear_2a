package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UrlParameterOuyouController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@RequestMapping(path = "/urlparamouyou", method = RequestMethod.GET)
	public String first(Model model) {

		List<Map<String, Object>> resultList = jdbcTemplate.queryForList("SELECT * FROM spitem");

		model.addAttribute("resultList", resultList);

		return "urlparamouyou";
	}

	/*
	 *＜演習問題＞
	 *URLの末尾を変数として受け取り、
	 *受け取った変数でDBを検索しなさい。
	 *検索後、modelに検索結果を格納しhtmlに表示する事。
	 *
	 *ヒント：htmlのaタグの末尾に注目！
	 *
	 *尚、受け取る際の変数名は「category」とする事
	 */
	@RequestMapping(path = "/urlparamouyou/{category}", method = RequestMethod.GET)
	public String first(@PathVariable String category, Model model) {

		List<Map<String, Object>> resultList = jdbcTemplate.queryForList("SELECT * FROM spitem WHERE category = ?",
				category);

		model.addAttribute("resultList", resultList);

		return "urlparamouyou";
	}
}
