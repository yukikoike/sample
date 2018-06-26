package co.jp.yuki.koike.sample.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 位置情報取得画面コントローラー
 */
@Controller
public class GettingLocationController {

    /**
     * Logger
     */
    private final static Logger logger =
            LoggerFactory.getLogger("co.jp.yuki.koike.sample.app.controller.LoginFormController");

    /**
     * 位置情報取得画面のView名を返す
     *
     * @return 位置情報取得画面のView名
     */
    @RequestMapping("/gettingLocation")
    String gettingLocation() {
        logger.info("enter GettingLocationController.");
        logger.info("exit GettingLocationController.");
        return "gettingLocation";
    }
}
