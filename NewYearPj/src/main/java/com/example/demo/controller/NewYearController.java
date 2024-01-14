package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewYearController {

	@Autowired
	JdbcTemplate jdbcTemplate;

	//画面表示用
	@RequestMapping(path = "/newyearfirst", method = RequestMethod.GET)
	public String first() {

		return "newyearfirst";
	}

	//画面表示用
	@RequestMapping(path = "/newyearsecond", method = RequestMethod.GET)
	public String second() {

		return "newyearsecond";
	}

	//画面表示用
	@RequestMapping(path = "/newyearthird", method = RequestMethod.GET)
	public String third() {

		return "newyearthird";
	}

	/*
	 *＜サンプル＞
	 * ！！！！！！コメント外さないで！！！！！！！
	 * URLの一部分を変数として扱う。
	 * 
	 * ＜説明＞
	 * @RequestMapping(path="/{変数名}")のように書く事で、
	 * URLの該当部分を変数として扱う事が出来る。
	 * ポイントを授業内で解説するので良く聞く事！
	 */
	//	@RequestMapping(path = "/urlparamexample/{testtest}", method = RequestMethod.GET)
	//	public String first(@PathVariable String testtest, Model model) {
	//
	//		model.addAttribute("aiueo", testtest);
	//		return "urlparam";
	//	}

	/*コメント外してね
	 * ＜練習問題①＞
	 * URLの末尾を変数として扱い、Sysoutで表示しなさい。
	 * 尚変数として扱う際の変数名は「firstParam」とする事
	 */
	//	@RequestMapping(path = "/newyearfirst/{??????}", method = RequestMethod.GET)
	//	public String first(@PathVariable String ?????) {
	//
	//		System.out.println(?????);
	//
	//		return "newyearfirst";
	//	}

	/*コメント外してね
	 * ＜練習問題②＞
	 * URLの末尾を変数として扱い、sessionに格納しなさい。
	 * 尚変数として扱う際の変数名は「secondParam」とし、
	 * sessionにしまう際の名前は「secondParam」とする事
	 */
	//	@RequestMapping(path = "/newyearsecond/{?????}", method = RequestMethod.GET)
	//		public String second(????,????) {
	//	
	//			//セッションに格納する。
	//			
	//			return "newyearsecond";
	//		}

	/*コメント外してね
	 * ＜練習問題③＞
	 * URLの末尾を変数として扱い、sessionに格納しなさい。
	 * 尚変数として扱う際の変数名は「thirdParam1」、「thirdParam2」とする事。
	 * sessionにしまう際の名前は「thirdParam」とし、
	 * 格納する値は「thirdParam1」と「thirdParam2」を結合したものとする。
	 * 
	 * 例：thirdParam1が「あ」でthirdParam2が「い」なら「あい」をセッションに格納する事
	 */
	//	@RequestMapping(path = "/newyearthird/{?????}/{?????}", method = RequestMethod.GET)
	//		public String third(????,????) {
	//	
	//			//セッションに格納する。
	//			
	//			return "newyearthird";
	//		}

	/*
	 * ＜練習問題④＞
	 * 練習問題③で作成したControllerにDB検索処理を追加しなさい。
	 * テーブル「spitem」に対し検索をかけ、カテゴリと商品名で絞り込みをかける事。
	 * 検索を行った後、検索結果が１件以上であればSysoutで「OK」とコンソール表示をし、
	 * そうでないなら「NG」と表示する事
	 */

	/*
	 *＜出来たら報酬があるとかないとか問題＞
	 *練習問題④のプログラムを「Entity」と「Repository」を用いた
	 *プログラムに変更しなさい。
	 */

}