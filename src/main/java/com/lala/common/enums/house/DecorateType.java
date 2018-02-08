package com.lala.common.enums.house;


/**
 * 装修类型 枚举类
 */
public enum DecorateType {

    _ROUGHCAST("1", "毛坯"),
    _SIMPLE("2", "简装"),
    _MIDDLE("3","中等装修"),
    _SPlENDID("4","豪华装修"),
    ;
    private String code;
    private String message;

    DecorateType(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
