package co.jp.yuki.koike.sample.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * DispatcherServlet用コンフィギュレーションクラス
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * Logger
     */
    private final static Logger logger =
            LoggerFactory.getLogger("co.jp.yuki.koike.sample.config.MvcConfig");

    /*
     * (非 Javadoc)
     * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry)
     */
    @Override
    public void addViewControllers(ViewControllerRegistry viewControllerRegistry) {
        viewControllerRegistry.addViewController("/loginFormController").setViewName("loginForm");
    }
}
