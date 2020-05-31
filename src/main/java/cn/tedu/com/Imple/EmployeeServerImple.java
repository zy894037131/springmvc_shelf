package cn.tedu.com.Imple;

import cn.tedu.com.bean.Employee;
import cn.tedu.com.dao.EmployeeMapperInter;
import cn.tedu.com.server.EmployeeServer;
import cn.tedu.com.server.TheSameTrantionTestServer;
import cn.tedu.com.util.ApplicationContextToolUtil;
import cn.tedu.com.util.ToolUtilTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

@Service
@Transactional
public class EmployeeServerImple implements EmployeeServer {
    @Autowired
    private EmployeeMapperInter employeeMapperInter;
    @Autowired
    private TheSameTrantionTestServer theSameTrantionTestServerImple;
    @Override
    public List<Employee> getAllEmps() {
        return employeeMapperInter.getAllEmps();
    }

    @Override
    public void saveEmp(Employee employee) throws Exception {
        employeeMapperInter.saveEmp(employee);
        /*employee.setId(employee.getId()+1);
        employee.setLastName("110");
        theSameTrantionTestServerImple.SameTrantionSave(employee);
        employee.setId(employee.getId()+1);
        employee.setLastName("120");
        ToolUtilTest.save2(employee);*/

        /*CompletableFuture.supplyAsync(()->{
            Employee employee1=new Employee(62,"110","1","110@qq.com");
            try {
                theSameTrantionTestServerImple.SameTrantionSave(employee1);
            } catch (Exception e) {
                e.getMessage();
            }
            return "success";
        }).exceptionally((e)->{
            return null;

        });*/
       /* Callable callable=new Callable() {
            @Override
            public Object call() throws Exception {
                Employee employee1=new Employee(62,"110","1","110@qq.com");
                theSameTrantionTestServerImple.SameTrantionSave(employee1);
                return "success";
            }
        };*/
    }

}
