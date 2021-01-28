package com.casiduso.democasiduso.service;

import com.casiduso.democasiduso.dto.moltiaunounid.PostCommentDto;

public interface PostCommentService {

	void addPostComment (PostCommentDto postCommentDto);
	PostCommentDto findPostCommentDto(Long id);
	void delPostComment (Long id);
}
