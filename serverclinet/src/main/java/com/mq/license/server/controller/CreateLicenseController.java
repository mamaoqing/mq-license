package com.mq.license.server.controller;

import com.alibaba.fastjson.JSONObject;
import com.mq.license.comon.entity.LicenseCreator;
import com.mq.license.comon.entity.LicenseParams;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mq
 * @description: TODO
 * @title: CreateLicenseController
 * @projectName license-mq
 * @date 2020/12/2318:06
 */
@RestController
@RequestMapping("/license")
public class CreateLicenseController {

    @Value("${license.licensePath}")
    private String licensePath;

    @PostMapping("/create")
    public JSONObject createLicense(@RequestBody LicenseParams param) {
        JSONObject result = new JSONObject();

        if (StringUtils.isBlank(param.getLicensePath())) {
            param.setLicensePath(licensePath);
        }
        System.out.println(param);

        LicenseCreator licenseCreator = new LicenseCreator(param);
        boolean results = licenseCreator.generateLicense();

        if (results) {
            result.put("result", "ok");
            result.put("msg", param);
        } else {
            result.put("result", "error");
            result.put("msg", "证书文件生成失败！");
        }
        return result;
    }


    @GetMapping("/verify")
    public JSONObject verify() {
        JSONObject result = new JSONObject();

        return result;
    }

    @GetMapping("/index")
    public JSONObject index(){
        JSONObject result = new JSONObject();
        result.put("message","success");
        result.put("code",200);
        return result;
    }
}
