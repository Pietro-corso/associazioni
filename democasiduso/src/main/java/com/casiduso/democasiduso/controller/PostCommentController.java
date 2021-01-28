package com.casiduso.democasiduso.controller;

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

import com.casiduso.democasiduso.dto.moltiaunounid.PostCommentDto;
import com.casiduso.democasiduso.service.PostCommentServiceImpl;

@RestController
@RequestMapping("/post-comment")
public class PostCommentController {

	@Autowired
	PostCommentServiceImpl postCommentServiceImpl;
	
	@PostMapping
	public ResponseEntity<String> savePostCommentDto(@RequestBody PostCommentDto postCommentDto){
		postCommentServiceImpl.addPostComment(postCommentDto);
		return new ResponseEntity<String>("Inserito commento", HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PostCommentDto> findPostCommentDto(@PathVariable("id") Long id){
		return new ResponseEntity<PostCommentDto>
		(postCommentServiceImpl.findPostCommentDto(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delPostCommentDto(@PathVariable("id") Long id){
		postCommentServiceImpl.delPostComment(id);
		return new ResponseEntity<String>("Cancellato commento", HttpStatus.OK);
	}
}
