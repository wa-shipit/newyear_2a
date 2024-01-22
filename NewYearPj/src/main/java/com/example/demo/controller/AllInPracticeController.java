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
public class AllInPracticeController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	//画面表示用
	@RequestMapping(path = "/allInPractice", method = RequestMethod.GET)
	public String first(Model model) {


		//移植対象①
		//DBへの接続し、全件検索を行う。
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList("SELECT * FROM spitem ");

		//モデルへの格納
		model.addAttribute("resultList", resultList);

		//htmlの表示
		return "allInPractice";
	}

	@RequestMapping(path = "/allInPractice/{categorycode}", method = RequestMethod.GET)
	public String first(@PathVariable String categorycode,Model model) {

	
		//移植対象②
		//ビジネスロジック
		//URLから受け取ったカテゴリコードを文字列に変換し、変換した文字列を変数categoryに格納する。
		//カテゴリコードが「0」なら「飲食品」、「1」なら「衣服」、「2」なら「書籍」とする事。
		String category = "";
		
		//移植対象③
		//DBへ接続し、カテゴリ列で検索をかける。
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList("SELECT * FROM spitem WHERE category = ?",
				category);

		model.addAttribute("resultList", resultList);

		
		//htmlの表示
		return "allInPractice";
	}
	
}
