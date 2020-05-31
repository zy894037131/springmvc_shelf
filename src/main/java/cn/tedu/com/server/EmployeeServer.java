package cn.tedu.com.server;

import cn.tedu.com.bean.Employee;

import java.util.List;

public interface EmployeeServer {
    public List<Employee> getAllEmps();
    public void saveEmp(Employee employee) throws Exception;
}
