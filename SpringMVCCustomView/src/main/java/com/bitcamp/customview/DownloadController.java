package com.bitcamp.customview;

import java.io.File;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController implements ApplicationContextAware {

	private WebApplicationContext context;

	
	@RequestMapping("/download/file")
	public ModelAndView download() {

		File file = getFile();

		return new ModelAndView("download", "downloadFile", file);
		//                     커스텀 뷰 이름    전달 데이터의 식별이름
	}

	private File getFile() {

		String path = context.getServletContext().getRealPath("/WEB-INF/공지.txt");

		return new File(path);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		context = (WebApplicationContext) applicationContext;

	}

}
