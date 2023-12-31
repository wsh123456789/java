package com.wsh.springboot.legalplant.model;

import com.wsh.springboot.util.PageVo;
import lombok.Data;

@Data
public class LegalPlantSelectVo extends PageVo {

    private Integer userId;

    private String legalPlantCode;

    private String legalPlantDec;

    private String legalPersonCode;

    private String legalPersonName;

    private Boolean enabled;

    private Integer version;

}
