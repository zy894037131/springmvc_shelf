package cn.tedu.com.util;

import cn.tedu.com.bean.Employee;
import cn.tedu.com.dao.EmployeeMapperInter;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

public class ToolUtilTest {

    public static void save(Employee employee) throws Exception {
        DefaultSqlSessionFactory sqlSessionFactoryBean= (DefaultSqlSessionFactory)ApplicationContextToolUtil.getApplicationContext().getBean("sqlSessionFactoryBean");
        EmployeeMapperInter mapper = sqlSessionFactoryBean.openSession().getMapper(EmployeeMapperInter.class);
        mapper.saveEmp(employee);
        int i=1/0;
    }
    public static void save2(Employee employee) throws Exception {
        DefaultSqlSessionFactory sqlSessionFactoryBean= (DefaultSqlSessionFactory)ApplicationContextToolUtil.getApplicationContext().getBean("sqlSessionFactoryBean");
        EmployeeMapperInter mapper = sqlSessionFactoryBean.openSession().getMapper(EmployeeMapperInter.class);
        mapper.saveEmp(employee);
        int i=1/0;
    }
}
