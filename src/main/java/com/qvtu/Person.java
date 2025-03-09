package com.qvtu;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 作者
 * @create 2025-03-09-09:15
 */
//@Component 表示此类为bean可以被扫描并识别；@ConfigurationProperties最好在后面加入能识别的前缀,例如（prefix = "person"）
@Component
@ConfigurationProperties
public class Person {

    private String msg1;
    private String msg2;

    public String getMsg1() {
        return msg1;
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }

    public String getMsg2() {
        return msg2;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "msg1='" + msg1 + '\'' +
                ", msg2='" + msg2 + '\'' +
                '}';
    }
}
