package com.casiduso.democasiduso.dto.moltiaunounid;

import com.casiduso.democasiduso.entities.moltiaunounid.Post;

public class PostCommentDto {

	private Long id;
	
	private String review;
	
	private Post post;

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

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	protected PostCommentDto(Long id, String review, Post post) {
		super();
		this.id = id;
		this.review = review;
		this.post = post;
	}

	public PostCommentDto() {
		super();
	}
	
	
}
