package co.jp.yuki.koike.encoding;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * エンコードしたパスワード表示クラス
 */
@Component
public class DisplayEncodingPassword {

    /**
     * エンコードしたパスワードをコマンドプロンプトに表示する
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {

        final String encodedPassword = new BCryptPasswordEncoder().encode("0000");

        System.out.println(encodedPassword);

    }
}
