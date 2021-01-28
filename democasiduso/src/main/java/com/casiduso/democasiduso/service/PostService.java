package com.casiduso.democasiduso.service;

import com.casiduso.democasiduso.dto.moltiaunounid.PostDto;

public interface PostService {

	void savePost(PostDto post);
	PostDto findPostDto(Long id);
	void delPost (Long id);
}
