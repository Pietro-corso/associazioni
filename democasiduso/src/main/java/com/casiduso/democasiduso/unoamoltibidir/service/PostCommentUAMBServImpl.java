package com.casiduso.democasiduso.unoamoltibidir.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casiduso.democasiduso.dto.unoamoltibidir.PostCommentUAMBDto;
import com.casiduso.democasiduso.unoamoltibid.repository.PostCommentUAMBRepository;
import com.casiduso.democasiduso.unoamoltibidir.converter.PostCommentConverter;

@Service
public class PostCommentUAMBServImpl implements PostCommentUAMBService{

	@Autowired
	PostCommentUAMBRepository postCommentRepository;

	@Override
	public void savePostCommentDto(PostCommentUAMBDto postCommentUAMBDto) {
		PostCommentConverter postCommentConverter = new PostCommentConverter();
		
		postCommentRepository.save(postCommentConverter.createFrom(postCommentUAMBDto));
		
		
	}

	@Override
	public PostCommentUAMBDto findPostCommentDto(Long id) {
		// TODO Auto-generated method stub
		PostCommentConverter postCommentConverter = new PostCommentConverter();
		return postCommentConverter.createFrom(postCommentRepository.findById(id).get());
	}

	@Override
	public void delPostCommentDto(Long id) {
		// TODO Auto-generated method stub
		postCommentRepository.deleteById(id);
	}
	
	
}
