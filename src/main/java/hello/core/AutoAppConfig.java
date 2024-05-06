package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member", //어디서부터 찾는지 지정할 수 있다.
        basePackageClasses = AutoAppConfig.class, //자기패키지부터 찾는다.

        // Configuration 에노테이션 한 것은 컴포넌트 스캔 하지 않는다
        excludeFilters= @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {
}
