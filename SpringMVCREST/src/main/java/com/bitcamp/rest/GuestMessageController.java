package com.bitcamp.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuestMessageController {

	@RequestMapping("/guest/messages/json")	
	public @ResponseBody GuestMessageList2 getJSON() {
			
		List<GuestMessage2> list = new ArrayList<GuestMessage2>();
		list.add(new GuestMessage2("1", "첫번째 메시지", new Date()));
		list.add(new GuestMessage2("2", "두번째 메시지", new Date()));
		list.add(new GuestMessage2("2", "세번째 메시지", new Date()));
		
		return new GuestMessageList2(list);
		 
	}
	
	
	
	@RequestMapping("/guest/messages/xml")	
	public @ResponseBody GuestMessageList getXml() {
			
		List<GuestMessage> list = new ArrayList<GuestMessage>();
		list.add(new GuestMessage("1", "첫번째 메시지", new Date()));
		list.add(new GuestMessage("2", "두번째 메시지", new Date()));
		list.add(new GuestMessage("2", "세번째 메시지", new Date()));
		
		return new GuestMessageList(list);
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
