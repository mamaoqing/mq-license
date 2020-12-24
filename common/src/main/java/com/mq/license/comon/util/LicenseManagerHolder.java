package com.mq.license.comon.util;

import de.schlichtherle.license.LicenseManager;
import de.schlichtherle.license.LicenseParam;

/**
 * @author mq
 * @description: TODO
 * @title: LicenseManagerHolder
 * @projectName license-mq
 * @date 2020/12/249:20
 */
public class LicenseManagerHolder {
    private static volatile LicenseManager LICENSE_MANAGER;

    public static LicenseManager getInstance(LicenseParam param){
        if(LICENSE_MANAGER == null){
            synchronized (LicenseManagerHolder.class){
                if(LICENSE_MANAGER == null){
                    LICENSE_MANAGER = new MqLicenseManage(param);
                }
            }
        }

        return LICENSE_MANAGER;
    }
}
