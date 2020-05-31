package cn.tedu.com.util;

import cn.tedu.com.bean.Employee;
import cn.tedu.com.dao.EmployeeMapperInter;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.context.ContextLoader;

public class ApplicationContextToolUtil implements ApplicationContextAware {
    //Spring应用上下文环境
    private static ApplicationContext applicationContext;

    /**
     * 7      * 实现ApplicationContextAware接口的回调方法，设置上下文环境
     * 8      * @param applicationContext
     * 9      * @throws BeansException
     * 10
     */
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
