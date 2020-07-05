package cn.tedu.com.Imple;

import cn.tedu.com.bean.Employee;
import cn.tedu.com.dao.EmployeeMapperInter;
import cn.tedu.com.server.TheSameTrantionTestServer;
import cn.tedu.com.util.ToolUtilTest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TheSameTrantionTestServerImple implements TheSameTrantionTestServer {
    private EmployeeMapperInter employeeMapperInter;
    @Override
    public void SameTrantionSave(Employee employee) throws Exception {
        ToolUtilTest.save(employee);
    }
}
