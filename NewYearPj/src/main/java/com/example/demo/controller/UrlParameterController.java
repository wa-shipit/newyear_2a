package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UrlParameterController {

	@RequestMapping(path = "/urlparam", method = RequestMethod.GET)
	public String first() {

		return "urlparam";
	}

	/*
	 *＜サンプル＞
	 * URLの一部分を変数として扱う。
	 * 
	 * ＜説明＞
	 * @RequestMapping(path="/{変数名}")のように書く事で、
	 * URLの該当部分を変数として扱う事が出来る。
	 * ポイントを授業内で解説するので良く聞く事！
	 */
	@RequestMapping(path = "/urlparam/{testtest}", method = RequestMethod.GET)
	public String first(@PathVariable String testtest, Model model) {

		System.out.println(testtest);

		model.addAttribute("aiueo", testtest);
		return "urlparam";
	}

	/*
	 *＜演習問題＞
	 * URLの末尾を変数として受け取り、
	 * 受け取った値が「演習問題」なら「YES」とsysoutし、
	 * そうでないなら「No」とSysoutする
	 * プログラムを作成しなさい。
	 * 
	 * 尚、受け取る際の変数名は「paramvar」とする事
	 */
	//		@RequestMapping(path = "/urlparam/{}", method = RequestMethod.GET)
	//		public String enshu() {
	//	
	//			if() {
	//				
	//			} else {
	//				
	//			}
	//			
	//			return "urlparam";
	//		}

}
