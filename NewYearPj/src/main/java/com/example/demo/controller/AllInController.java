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
public class AllInController {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	

	//画面表示用
	@RequestMapping(path = "/allIn", method = RequestMethod.GET)
	public String first(Model model) {

		//ビジネスロジック
		//int型変数「a」に10を代入して
		//変数の「a」が10以上か判定するif文を書いてね。


		//ビジネスロジック②
		//int型変数「b」に10を代入して、「c」に20を代入する。
		//「d」にbとcの合計値を格納する。
		
		
		//DBへの接続
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList("SELECT * FROM spitem ");

		//モデルへの格納
		model.addAttribute("resultList", resultList);

		//htmlの表示
		return "allIn";
	}

	@RequestMapping(path = "/allIn/{category}", method = RequestMethod.GET)
	public String first(@PathVariable String category,Model model) {


		
		
		//【慣れよう問題】
		//↓のカテゴリ検索をRepositoryに移植しよう。
		List<Map<String, Object>> resultList = jdbcTemplate.queryForList("SELECT * FROM spitem WHERE category = ?",
				category);

		model.addAttribute("resultList", resultList);

		
		
		return "allIn";
	}
	
}
