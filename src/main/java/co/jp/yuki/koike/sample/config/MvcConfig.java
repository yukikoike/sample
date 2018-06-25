package co.jp.yuki.koike.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * DispatcherServlet用コンフィギュレーションクラス
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

	/*
	 * (非 Javadoc)
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry)
	 */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
}
