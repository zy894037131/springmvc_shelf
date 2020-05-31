package cn.tedu.com.control;

import cn.tedu.com.bean.Employee;
import cn.tedu.com.server.EmployeeServer;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
public class EmployeesControler {
   private static final Log log=LogFactory.getLog(EmployeesControler.class);
    @Autowired
    private EmployeeServer employeeServerImple;
    @RequestMapping("/emps")
    public String getAllEmps(Map<String,Object> map){
        List<Employee> allEmps = employeeServerImple.getAllEmps();
        log.info("getAllEmps==>allEmps={}"+allEmps);
        map.put("allEmps",allEmps);
        return "list";
    }

    @RequestMapping("/saveEmp")
    public String saveEmp(Employee employee) throws Exception {
        log.info("emp={}"+employee);
        employeeServerImple.saveEmp(employee);
        return "success";
    }
}
