package com.stu.manage.demo.entity;


import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 登录
 *
 * @author 刘龙
 */


@Data
public class Login {
    @NotNull
    private String adminName;
    @NotNull
    private String passWord;
}
