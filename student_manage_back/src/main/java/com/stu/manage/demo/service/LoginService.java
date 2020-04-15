package com.stu.manage.demo.service;

/**
 * @author 刘龙
 */

public interface LoginService {

    /**
     * 查询管理员对应的密码
     *
     * @param name
     * @return String
     */
    String getAdmin(String name);
}
