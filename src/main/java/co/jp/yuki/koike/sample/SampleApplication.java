package co.jp.yuki.koike.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * エントリポイントクラス
 */
@SpringBootApplication
public class SampleApplication {

    /**
     * サンプルサプリケーションを起動する
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}
