/**
 * @author Arcry
 * @date 2019年5月18日
 * @time 上午9:31:45
 */
package com.dada.controller;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {

	@Test
	public void testFtpClient() throws Exception {
		//创建一个FtpClient对象
		FTPClient ftpClient = new FTPClient();
		//创建FTP连接
		ftpClient.connect("192.168.86.128",21);
		//登录ftp服务器，使用用户名和密码
		ftpClient.login("ftpuser", "root");
		
		//上传文件
		//读取本地文件
		FileInputStream inputStream = new FileInputStream(
				new File(("C:\\Users\\97912\\Desktop\\ys.jpg")));
		//设置上传的路径
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
		//修改上传文件的格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.setFileTransferMode(FTP.BINARY_FILE_TYPE);
		// 第一个参数：服务器端文件名
		// 第二个参数：上传文档的inputStream
		ftpClient.enterLocalPassiveMode();
		ftpClient.setControlEncoding("UTF-8");
		ftpClient.storeUniqueFile("ys.jpg", inputStream);

		inputStream.close();
		//关闭连接
		ftpClient.logout();
	}
}
