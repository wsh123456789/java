package com.wsh.springboot.inquirysheet.model;

import com.wsh.springboot.util.PageVo;
import lombok.Data;

@Data
public class CreateInquirySheetSelectVo extends PageVo {
    // id
    private Integer id;
    // 备件编码
    private String code;
    // 备件名称
    private String name;
}
