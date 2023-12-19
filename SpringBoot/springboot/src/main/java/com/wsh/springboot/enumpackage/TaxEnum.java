package com.wsh.springboot.enumpackage;

import com.wsh.springboot.util.ParamUtil;

public enum TaxEnum {
    TAX(ParamUtil.ZERO,ParamUtil.TAX),NULL_TAX(ParamUtil.ONE,ParamUtil.NULL_TAX);

    private Integer value;
    private String name;

    TaxEnum(Integer value, String name){
        this.value = value;
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public Integer getValue(){
        return value;
    }
}