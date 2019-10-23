package jp.co.musako.config;

import jp.co.musako.domain.model.ExcludeLazyInitializationDemoBean;
import jp.co.musako.domain.model.LazyInitializationDemoBean;
import org.springframework.boot.LazyInitializationExcludeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class Config {

    @Bean
    static LazyInitializationExcludeFilter integrationLazyInitExcludeFilter() {
        return LazyInitializationExcludeFilter.forBeanTypes(ExcludeLazyInitializationDemoBean.class);
    }

    // Lazy Initialization適用対象
    @Bean("lazyInitializationDemoBean1")
    public LazyInitializationDemoBean lazyInitializationDemoBean1() {
        return new LazyInitializationDemoBean("lazyInitializationDemoBean1");
    }

    // Lazy Initialization適用対象外
    @Bean("lazyInitializationDemoBean2")
    @Lazy(false)
    public LazyInitializationDemoBean lazyInitializationDemoBean2() {
        return new LazyInitializationDemoBean("lazyInitializationDemoBean2");
    }

    // Lazy Initialization適用対象外
    @Bean
    public ExcludeLazyInitializationDemoBean ExcludeLazyInitializationDemoBean() {
        return new ExcludeLazyInitializationDemoBean("excludeLazyInitializationDemoBean");
    }
}
