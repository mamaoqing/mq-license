package com.mq.license.comon.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author mq
 * @description: TODO
 * @title: LicenseCheck
 * @projectName license-mq
 * @date 2020/12/2317:36
 */
@Data
public class LicenseCheck implements Serializable {

    /**
     * 可被允许的IP地址
     */
    private List<String> ipAddress;

    /**
     * 可被允许的MAC地址
     */
    private List<String> macAddress;

    /**
     * 可被允许的CPU序列号
     */
    private String cpuSerial;

    /**
     * 可被允许的主板序列号
     */
    private String mainBoardSerial;
}
