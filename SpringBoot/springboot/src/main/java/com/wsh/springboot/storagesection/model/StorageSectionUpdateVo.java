package com.wsh.springboot.storagesection.model;

import com.wsh.springboot.util.ParamUtil;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class StorageSectionUpdateVo {

    @NotNull(message = ParamUtil.WAREHOUSE_AREA + ParamUtil.ID_NOTNULL)
    private Integer id;
    @NotBlank(message = ParamUtil.WAREHOUSE_AREA + ParamUtil.NAME_NOTNULL)
    private String name;
    private Boolean status;
    private String remark;
    private int version;

}
