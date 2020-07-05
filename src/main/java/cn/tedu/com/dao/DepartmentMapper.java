package cn.tedu.com.dao;

import cn.tedu.com.bean.Department;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}