package co.jp.yuki.koike.sample.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ログイン画面コントローラー
 */
@Controller
public class LoginFormController {

    /**
     * Logger
     */
    private final static Logger logger =
            LoggerFactory.getLogger("co.jp.yuki.koike.sample.app.controller.LoginFormController");

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
