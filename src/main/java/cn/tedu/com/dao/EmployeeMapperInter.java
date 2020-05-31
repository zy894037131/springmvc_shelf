package cn.tedu.com.dao;
import cn.tedu.com.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 与mapper 进行映射
 * 类 main.cn.tedu.com.main.daointer.EmployeeMapperInter名与mapper namespace对应
 */
public interface EmployeeMapperInter {
    /**
     * 方法名和mapper sql.id对应
     * 参数即传入sql的参数类型
     * @param id
     * @return
     */
    public Employee getEmployeeById(Integer id);

    public List<Employee> getAllEmps();

    public void saveEmp(Employee employee);
}
