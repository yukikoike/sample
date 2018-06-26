package co.jp.yuki.koike.sample.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * LoginFormコントローラー
 */
@Controller
public class LoginFormController {

	/**
	 * ログイン画面のView名を返す
	 *
	 * @return ログイン画面のView名
	 */
	@RequestMapping("/loginForm")
	String loginForm() {
		return "loginForm";
	}
}
