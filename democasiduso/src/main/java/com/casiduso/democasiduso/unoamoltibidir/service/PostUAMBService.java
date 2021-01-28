package com.casiduso.democasiduso.unoamoltibidir.service;

import com.casiduso.democasiduso.dto.unoamoltibidir.PostUAMBDto;

public interface PostUAMBService {

	void addPostDto (PostUAMBDto postDto);
	PostUAMBDto findPostDto (Long id);
	void delPostDto (Long id);
}
