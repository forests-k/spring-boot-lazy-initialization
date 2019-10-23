package jp.co.musako;

import jp.co.musako.domain.model.ExcludeLazyInitializationDemoBean;
import jp.co.musako.domain.model.LazyInitializationDemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Initialize Application Context");

        LazyInitializationDemoBean bean1 = ctx.getBean("lazyInitializationDemoBean1", LazyInitializationDemoBean.class);
        bean1.writer("first bean");

        LazyInitializationDemoBean bean2 = ctx.getBean("lazyInitializationDemoBean2", LazyInitializationDemoBean.class);
        bean2.writer("second bean");

        ExcludeLazyInitializationDemoBean ExcludeLazyInitializationBean = ctx.getBean("ExcludeLazyInitializationDemoBean", ExcludeLazyInitializationDemoBean.class);
        ExcludeLazyInitializationBean.writer("third bean");
    }

}
