package org.jeff.springboot.slayui;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "org.jeff.springboot")
//@EntityScan(basePackages = "org.jeff.springboot.bootdomain.domain")
//@EnableJpaRepositories(basePackages = "org.jeff.springboot.bootdomain.domain")
public class SlayuiApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
        new SpringApplicationBuilder(SlayuiApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SlayuiApplication.class);
    }
}
