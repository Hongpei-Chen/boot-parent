package org.jeff.springboot.slayui.config.beetl;

import org.beetl.core.resource.ClasspathResourceLoader;
import org.beetl.ext.spring.BeetlSpringViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class BeetlConfig {

    @Bean(initMethod = "init")
    public BeetlConfiguration beetlConfiguration() {
        BeetlConfiguration beetlConfiguration = new BeetlConfiguration();
        beetlConfiguration.setResourceLoader(new ClasspathResourceLoader(BeetlConfig.class.getClassLoader(), "templates/"));
        beetlConfiguration.setConfigProperties(beetlProperties());
        return beetlConfiguration;
    }

    @Bean
    public BeetlSpringViewResolver beetlSpringViewResolver(BeetlConfiguration beetlConfiguration) {
        BeetlSpringViewResolver resolver = new BeetlSpringViewResolver();
        resolver.setConfig(beetlConfiguration);
        resolver.setOrder(0);
        resolver.setSuffix(".html");
        resolver.setContentType("text/html;charset=UTF-8");
        resolver.setRedirectHttp10Compatible(false);
        return resolver;
    }

    private Properties beetlProperties() {
        Properties properties = new Properties();
        properties.setProperty("DELIMITER_STATEMENT_START", "@");
        properties.setProperty("DELIMITER_STATEMENT_END", "null");
        return properties;
    }
}
