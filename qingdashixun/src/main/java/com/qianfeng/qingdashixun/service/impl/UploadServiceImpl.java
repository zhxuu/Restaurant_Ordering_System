package com.qianfeng.qingdashixun.service.impl;

import com.qianfeng.qingdashixun.service.UploadService;
import com.qianfeng.qingdashixun.util.Base64Util;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

@Service
public class UploadServiceImpl implements UploadService {
    @Override
    public Map<String, Object> fileUpload(MultipartFile file) {
        String base64 = Base64Util.generateBase64(file);
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("img_url",base64);
        return map;
    }
}
