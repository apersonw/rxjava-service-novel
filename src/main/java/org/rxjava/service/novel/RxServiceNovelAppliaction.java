package org.rxjava.service.novel;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author happy 2019-05-10 18:06
 */
@SpringBootApplication
public class RxServiceNovelAppliaction {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RxServiceNovelAppliaction.class).web(WebApplicationType.REACTIVE).run(args);
    }
}
