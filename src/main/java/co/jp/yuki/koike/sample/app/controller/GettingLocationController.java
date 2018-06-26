package co.jp.yuki.koike.sample.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 位置情報取得画面コントローラー
 */
@Controller
public class GettingLocationController {

    /**
     * 位置情報取得画面のView名を返す
     *
     * @return 位置情報取得画面のView名
     */
    @RequestMapping("/gettingLocation")
    String gettingLocation() {
        return "gettingLocation";
    }
}
