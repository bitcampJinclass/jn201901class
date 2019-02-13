package com.bitcamp.rest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	// http://localhost/rest/view?p=1&num=10&sNum=12
	// p=1&num=10&sNum=12
	// @RequestParam

	// http://localhost/rest/msgs/25
	// 25
	// @GetMapping("/rest/msgs/{id}")
	// @pathVariable("id")

	@GetMapping("/rest/msgs/{id}")
	public String getMsg(

			@PathVariable("id") String id

	) {

		return id + " : hello~!!";
	}

	// @PostMapping
	// @PutMapping
	// @DeleteMapping

	@GetMapping("/rest/messages/{id}")
	public GuestMessage2 getMessage(@PathVariable("id") String id) {
		return new GuestMessage2(id, "안녕하세요", new Date());
	}

	@GetMapping("/rest/messages")
	public GuestMessageList2 getMessageList() {
		List<GuestMessage2> list = new ArrayList<GuestMessage2>();
		list.add(new GuestMessage2("1", "첫번째 메시지", new Date()));
		list.add(new GuestMessage2("2", "두번째 메시지", new Date()));
		list.add(new GuestMessage2("2", "세번째 메시지", new Date()));

		return new GuestMessageList2(list);

	}
	
	@PostMapping("/rest/message")
	public GuestMessage2 insert(
			@RequestBody GuestMessage2 message2) {
			
		message2.setMessage(message2.getMessage()+" - append data");
		System.out.println(message2);
		message2.setCreationTime(new Date());
		
		return message2;
	}
	
	
	
	
	
	
	
	

}
