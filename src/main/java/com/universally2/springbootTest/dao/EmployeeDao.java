package com.universally2.springbootTest.dao;

import com.universally2.springbootTest.pojo.Department;
import com.universally2.springbootTest.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author linfeng.chen@nio.com
 * @Date 2022/11/21 22:11
 */
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employeeMap = null;

    @Autowired
    private DepartmentDao departmentDao;

    static {
        employeeMap = new HashMap<>();
        employeeMap.put(1001, new Employee(1001, "AAA", "A2323@qq.com", 0, new Department(101, "教学部")));
        employeeMap.put(1002, new Employee(1002, "BBB", "B2323@qq.com", 1, new Department(102, "市场部")));
        employeeMap.put(1003, new Employee(1003, "CCC", "C2323@qq.com", 0, new Department(103, "教研部")));
        employeeMap.put(1004, new Employee(1004, "DDD", "S2323@qq.com", 1, new Department(104, "运营部")));
        employeeMap.put(1005, new Employee(1005, "EEE", "E2323@qq.com", 0, new Department(105, "后勤部")));
    }

    private static Integer initId = 1006;

    public void save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartment(employee.getDepartment().getId()));

        employeeMap.put(employee.getId(), employee);
    }

    public Collection<Employee> getALl() {
        return employeeMap.values();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeMap.get(id);
    }

    public void deleteEmployee(Integer id) {
        employeeMap.remove(id);
    }
}
