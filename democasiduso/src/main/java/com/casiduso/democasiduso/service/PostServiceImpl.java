package com.casiduso.democasiduso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casiduso.democasiduso.converter.PostConverter;
import com.casiduso.democasiduso.dto.moltiaunounid.PostDto;
import com.casiduso.democasiduso.repository.PostRepository;

@Service
public class PostServiceImpl implements PostService{

	@Autowired
	PostRepository postRepository;

	@Override
	public void savePost(PostDto postDto) {
		PostConverter postConverter = new PostConverter();
		postRepository.save(postConverter.createFrom(postDto));		
	}

	@Override
	public PostDto findPostDto(Long id) {
		// TODO Auto-generated method stub
		PostConverter postConverter = new PostConverter();
		return postConverter.createFrom(postRepository.findById(id).get());
	}

	@Override
	public void delPost(Long id) {
		postRepository.deleteById(id);
		
	}
	
	
}
