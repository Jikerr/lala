package com.lala.common.enums.house;


/**
 * 房屋朝向枚举类
 */
public enum HouseOrientation {

    _E("1", "东"),
    _W("2", "西"),
    _S("3","南"),
    _N("4","北"),
    ;
    private String code;
    private String message;

    HouseOrientation(String code, String message) {
        this.code = code;
        this.message = message;
    }

}
