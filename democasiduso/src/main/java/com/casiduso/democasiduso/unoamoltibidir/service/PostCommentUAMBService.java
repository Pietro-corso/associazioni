package com.casiduso.democasiduso.unoamoltibidir.service;

import com.casiduso.democasiduso.dto.unoamoltibidir.PostCommentUAMBDto;

public interface PostCommentUAMBService {

	void savePostCommentDto (PostCommentUAMBDto postCommentDto);
	PostCommentUAMBDto findPostCommentDto (Long id);
	void delPostCommentDto (Long id);
}
