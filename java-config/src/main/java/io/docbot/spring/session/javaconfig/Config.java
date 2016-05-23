package io.docbot.spring.session.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created with IntelliJ IDEA.
 * User: zhangxiang
 * Date: 16/5/22
 * Time: 下午7:53
 * To change this template use File | Settings | File Templates.
 */
@EnableRedisHttpSession
public class Config {
    @Bean
    public JedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    public CookieSerializer cookieSerializer() {
        DefaultCookieSerializer serializer = new DefaultCookieSerializer();
        serializer.setCookieName("token");
        serializer.setCookiePath("/");
        serializer.setDomainNamePattern("^.+?\\.(\\w+\\.[a-z]+)$");
        serializer.setUseHttpOnlyCookie(true);
        return serializer;
    }
//    @Bean
//    public HttpSessionStrategy httpSessionStrategy() {
//        return new HeaderHttpSessionStrategy();
//    }
    @Bean
    public HttpSessionListener myHttpSessionListener(){
        return new HttpSessionListener() {
            @Override
            public void sessionCreated(HttpSessionEvent se) {
            }

            @Override
            public void sessionDestroyed(HttpSessionEvent se) {
            }
        };
    }
}
