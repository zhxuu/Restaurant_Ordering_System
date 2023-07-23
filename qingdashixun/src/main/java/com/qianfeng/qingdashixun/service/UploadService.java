package com.qianfeng.qingdashixun.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface UploadService {
    Map<String, Object> fileUpload(MultipartFile file);
}
