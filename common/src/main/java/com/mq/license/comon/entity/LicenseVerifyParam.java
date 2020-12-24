package com.mq.license.comon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author mq
 * @description: TODO
 * @title: LicenseVerifyParam
 * @projectName license-mq
 * @date 2020/12/249:14
 */
@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class LicenseVerifyParam {
    /**
     * 证书subject
     */
    private String subject;

    /**
     * 公钥别称
     */
    private String publicAlias;

    /**
     * 访问公钥库的密码
     */
    private String storePass;

    /**
     * 证书生成路径
     */
    private String licensePath;

    /**
     * 密钥库存储路径
     */
    private String publicKeysStorePath;
}
