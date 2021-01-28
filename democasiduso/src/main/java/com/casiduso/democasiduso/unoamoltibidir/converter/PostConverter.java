package com.casiduso.democasiduso.unoamoltibidir.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;

import com.casiduso.democasiduso.dto.unoamoltibidir.PostUAMBDto;
import com.casiduso.democasiduso.entities.unoamoltibidir.PostCommentUAMB;
import com.casiduso.democasiduso.entities.unoamoltibidir.PostUAMB;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class PostConverter {

	public PostUAMB createFrom2(PostUAMBDto postDto) {
		PostCommentConverter conv = new PostCommentConverter();
		PostUAMB entity = new PostUAMB();
		BeanUtils.copyProperties(postDto, entity);
		
		return entity;
	}
	
	public PostUAMB createFrom(PostUAMBDto postDto) {
		PostCommentConverter conv = new PostCommentConverter();
		PostUAMB entity = new PostUAMB();
		
		BeanUtils.copyProperties(postDto, entity);
		List<PostCommentUAMB> p = new ArrayList<>();
		
		postDto.getComments().stream().map(t -> p.add(conv.createFrom(t))).collect(Collectors.toList());
		//p.stream().forEach(a -> a.setPostUAMB(createFrom2(postDto)));
		entity.setComments(p);
		
		return entity;
	}
	
	public PostUAMBDto createFrom(PostUAMB post) {
		PostUAMBDto dto = new PostUAMBDto();
		BeanUtils.copyProperties(post, dto);
		
		return dto;
	}
	
	
}
