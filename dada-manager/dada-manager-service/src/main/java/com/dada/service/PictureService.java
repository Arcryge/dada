/**
 * @author Arcry
 * @date 2019年5月18日
 * @time 下午2:14:21
 */
package com.dada.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {

	Map uploadPicture(MultipartFile multipartFile);
}
