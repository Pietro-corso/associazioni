package com.casiduso.democasiduso.converter;

import org.springframework.beans.BeanUtils;

import com.casiduso.democasiduso.dto.moltiaunounid.PostCommentDto;
import com.casiduso.democasiduso.entities.moltiaunounid.PostComment;

public class PostCommentConverter {
	public PostComment createFrom(PostCommentDto postCommentDto) {
		PostComment entity = new PostComment(1L,null,null);
		BeanUtils.copyProperties(postCommentDto, entity);
		
		return entity;
	}
	
	public PostCommentDto createFrom(PostComment postComment) {
		PostCommentDto postCommentDto = new PostCommentDto();
		BeanUtils.copyProperties(postComment, postCommentDto);
		
		return postCommentDto;
	}
}
