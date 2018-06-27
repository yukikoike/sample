package co.jp.yuki.koike.sample.app.controller;

import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

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
        logger.info("enter ettingLocation.");

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.newInstance();

        URI uri = uriComponentsBuilder.scheme("https").host("localhost:8080").path("/gettingLocation")
                .build().toUri();

        logger.info("exit gettingLocation.");
        return "redirect: " + uri.toString();
    }
}
