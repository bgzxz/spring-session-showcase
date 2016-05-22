package io.docbot.spring.session.javaconfig;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/22
 * Time: 下午8:01
 * To change this template use File | Settings | File Templates.
 */
public class Initializer extends AbstractHttpSessionApplicationInitializer {

    public Initializer() {
        super(Config.class);
    }
}
