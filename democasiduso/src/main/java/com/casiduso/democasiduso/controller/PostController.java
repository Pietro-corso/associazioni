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

import com.casiduso.democasiduso.dto.moltiaunounid.PostDto;
import com.casiduso.democasiduso.service.PostServiceImpl;

@RestController
@RequestMapping("/post")
public class PostController {

	@Autowired
	PostServiceImpl postServiceImpl;
	
	@PostMapping
	public ResponseEntity<String> savePostDto(@RequestBody PostDto postDto){
		postServiceImpl.savePost(postDto);
		return new ResponseEntity<>("Inserito Post", HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PostDto> findPostDto(@PathVariable("id") Long id){
		return new ResponseEntity<>(postServiceImpl.findPostDto(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delPostDto(@PathVariable("id") Long id){
		postServiceImpl.delPost(id);
		return new ResponseEntity<String>("Cancellato post",HttpStatus.OK);
	}
}
