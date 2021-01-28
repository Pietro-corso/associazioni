package com.casiduso.democasiduso.unoamoltibidir.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casiduso.democasiduso.dto.unoamoltibidir.PostCommentUAMBDto;
import com.casiduso.democasiduso.dto.unoamoltibidir.PostUAMBDto;
import com.casiduso.democasiduso.unoamoltibid.repository.PostUAMBRepository;
import com.casiduso.democasiduso.unoamoltibidir.converter.PostConverter;


@Service
public class PostUAMBServiceImpl implements PostUAMBService{

	@Autowired
	PostUAMBRepository postRepository;
	
	@Override
	public void addPostDto(PostUAMBDto postDto) {
		PostConverter postConverter = new PostConverter();
		
		postRepository.save(postConverter.createFrom(postDto));
		
	}

	@Override
	public PostUAMBDto findPostDto(Long id) {
		// TODO Auto-generated method stub
		PostConverter postConverter = new PostConverter();
		return postConverter.createFrom(postRepository.findById(id).get());
	}

	@Override
	public void delPostDto(Long id) {
		// TODO Auto-generated method stub
		postRepository.deleteById(id);
	}

}
