/**
 * @author Arcry
 * @date 2019年5月18日
 * @time 下午2:59:53
 */
package com.dada.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dada.common.utils.JsonUtils;
import com.dada.service.PictureService;

/**
 * 上传图片处理
 *  
 * @author Arcry
 * @version 0.1
 * @date 2019年5月18日 下午3:00:09
 */

@Controller
public class PictureController {

	@Autowired
	private PictureService pictureService;

	@RequestMapping("/pic/upload")
	@ResponseBody
	public String uploda(MultipartFile uploadFile) throws Exception {
		Map result = pictureService.uploadPicture(uploadFile);
		//为了保证功能的兼容性，需要把Result转换成json格式的字符串。
		String json = JsonUtils.objectToJson(result);
		return json;
	}
}
