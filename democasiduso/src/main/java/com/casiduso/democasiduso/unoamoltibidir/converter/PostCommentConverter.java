package com.casiduso.democasiduso.unoamoltibidir.converter;

import org.springframework.beans.BeanUtils;

import com.casiduso.democasiduso.dto.unoamoltibidir.PostCommentUAMBDto;
import com.casiduso.democasiduso.dto.unoamoltibidir.PostUAMBDto;
import com.casiduso.democasiduso.entities.unoamoltibidir.PostCommentUAMB;
import com.casiduso.democasiduso.entities.unoamoltibidir.PostUAMB;



public class PostCommentConverter {
	public PostUAMB createFrom2(PostUAMBDto postDto) {
		//PostCommentConverter conv = new PostCommentConverter();
		PostUAMB entity = new PostUAMB();
		BeanUtils.copyProperties(postDto, entity);
		
		return entity;
	}
	
	
	public PostCommentUAMB createFrom(PostCommentUAMBDto postCommentDto) {
		PostCommentUAMB entity = new PostCommentUAMB();
		
		BeanUtils.copyProperties(postCommentDto, entity);
		entity.setId(null);
		
		return entity;
	}
	
	public PostCommentUAMBDto createFrom(PostCommentUAMB postComment) {
		PostCommentUAMBDto postCommentDto = new PostCommentUAMBDto();
		BeanUtils.copyProperties(postComment, postCommentDto);
		
		return postCommentDto;
	}
	
	
}
