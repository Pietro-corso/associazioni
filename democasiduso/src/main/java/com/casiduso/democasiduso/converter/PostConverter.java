package com.casiduso.democasiduso.converter;

import org.springframework.beans.BeanUtils;

import com.casiduso.democasiduso.dto.moltiaunounid.PostDto;
import com.casiduso.democasiduso.entities.moltiaunounid.Post;



public class PostConverter {

	public Post createFrom(PostDto postDto) {
		Post entity = new Post(1L,"");
		BeanUtils.copyProperties(postDto, entity);
		
		return entity;
	}
	
	public PostDto createFrom(Post post) {
		PostDto dto = new PostDto();
		BeanUtils.copyProperties(post, dto);
		
		return dto;
	}
	
}
