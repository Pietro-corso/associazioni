package com.casiduso.democasiduso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casiduso.democasiduso.converter.PostCommentConverter;
import com.casiduso.democasiduso.dto.moltiaunounid.PostCommentDto;
import com.casiduso.democasiduso.repository.PostCommentRepository;

@Service
public class PostCommentServiceImpl implements PostCommentService{

	@Autowired
	PostCommentRepository postCommentRepository;
	
	@Override
	public void addPostComment(PostCommentDto postCommentDto) {
		PostCommentConverter postCommentConverter = new PostCommentConverter();
		// l'inserimento avviene passando il review e il post con l'id
		postCommentRepository.save(postCommentConverter.createFrom(postCommentDto));		
		
	}

	@Override
	public PostCommentDto findPostCommentDto(Long id) {
		PostCommentConverter postCommentConverter = new PostCommentConverter();
		return postCommentConverter.createFrom(postCommentRepository.findById(id).get());
	}

	@Override
	public void delPostComment(Long id) {
		postCommentRepository.deleteById(id);
		
	}

}
