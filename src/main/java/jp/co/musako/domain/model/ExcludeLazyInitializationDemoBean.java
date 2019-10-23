package jp.co.musako.domain.model;

public class ExcludeLazyInitializationDemoBean {

    private String message;

    public ExcludeLazyInitializationDemoBean(String message) {
        this.message = message;
        System.out.println("call constructor " + this.message);
    }

    public void writer(String message) {
        System.out.println(this.message + " is " + message);
    }
}
