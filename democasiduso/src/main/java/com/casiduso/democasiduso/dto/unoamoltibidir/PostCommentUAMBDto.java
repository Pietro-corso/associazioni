package com.casiduso.democasiduso.dto.unoamoltibidir;

import com.casiduso.democasiduso.entities.unoamoltibidir.PostCommentUAMB;

public class PostCommentUAMBDto {

private Long id;
	
	private String review;
	
	private PostUAMBDto postDto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public PostUAMBDto getPost() {
		return postDto;
	}

	
	public PostCommentUAMBDto(String review) {
		super();
		this.review = review;
	}

	public void setPostDto(PostUAMBDto postDto) {
		this.postDto = postDto;
	}

	protected PostCommentUAMBDto(Long id, String review, PostUAMBDto postDto) {
		super();
		this.id = id;
		this.review = review;
		this.postDto = postDto;
	}

	public PostCommentUAMBDto() {
		super();
	}
	
	public void addComment(PostCommentUAMBDto comment) {
		this.postDto = comment.getPost();
		
	}
}