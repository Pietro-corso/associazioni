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

import com.casiduso.democasiduso.dto.unoamoltibidir.PostUAMBDto;
import com.casiduso.democasiduso.unoamoltibidir.service.PostUAMBServiceImpl;


@RestController
@RequestMapping("/postuamb")
public class PostUAMBController {

	@Autowired
	PostUAMBServiceImpl postServiceImpl;
	
	@PostMapping
	public ResponseEntity<String> savePostDto(@RequestBody PostUAMBDto postDto){
		postServiceImpl.addPostDto(postDto);
		
		return new ResponseEntity<String>("Inserito post",HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PostUAMBDto> findPostDto(@PathVariable("id") Long id){
		return new ResponseEntity<PostUAMBDto>(postServiceImpl.findPostDto(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delPostDto(@PathVariable("id") Long id){
		postServiceImpl.delPostDto(id);
		
		return new ResponseEntity<String>("Cancellato commento", HttpStatus.OK);
	}
}
