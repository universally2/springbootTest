package com.universally2.springbootTest.dao;

import com.universally2.springbootTest.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author linfeng.chen@nio.com
 * @Date 2022/11/21 22:07
 */
@Repository
public class DepartmentDao {

    private static Map<Integer, Department> departmentMap = null;

    static {
        departmentMap = new HashMap<>();
        departmentMap.put(101, new Department(101, "教学部"));
        departmentMap.put(101, new Department(102, "市场部"));
        departmentMap.put(101, new Department(103, "教研部"));
        departmentMap.put(101, new Department(104, "运营部"));
        departmentMap.put(101, new Department(105, "后勤部"));
    }

    public Collection<Department> getDepartments() {
        return departmentMap.values();
    }

    public Department getDepartment(Integer id) {
        return departmentMap.get(id);
    }
}
