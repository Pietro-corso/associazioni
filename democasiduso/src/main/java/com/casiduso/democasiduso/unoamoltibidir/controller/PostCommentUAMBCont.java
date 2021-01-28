package com.casiduso.democasiduso.unoamoltibidir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casiduso.democasiduso.dto.unoamoltibidir.PostCommentUAMBDto;
import com.casiduso.democasiduso.unoamoltibidir.service.PostCommentUAMBServImpl;

@RestController
@RequestMapping("/postuamb-comment")
public class PostCommentUAMBCont {

	@Autowired
	PostCommentUAMBServImpl postCommentUAMBServImpl;
	
	@PostMapping
	public ResponseEntity<String> savePostDto(@RequestBody PostCommentUAMBDto postCommentDto){
		postCommentUAMBServImpl.savePostCommentDto(postCommentDto);
		
		return new ResponseEntity<String>("Inserito post",HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PostCommentUAMBDto> findPostDto(@PathVariable("id") Long id){
		return new ResponseEntity<PostCommentUAMBDto>(postCommentUAMBServImpl.findPostCommentDto(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delPostCommentDto(@PathVariable("id") Long id){
		postCommentUAMBServImpl.delPostCommentDto(id);
		
		return new ResponseEntity<String>("Cancellato commento", HttpStatus.OK);
	}
}
