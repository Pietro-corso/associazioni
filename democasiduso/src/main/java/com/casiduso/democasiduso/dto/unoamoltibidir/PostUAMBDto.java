package com.casiduso.democasiduso.dto.unoamoltibidir;

import java.util.ArrayList;
import java.util.List;



public class PostUAMBDto {

	private Long id;

	private List<PostCommentUAMBDto> comments = new ArrayList<>();

	private String title;
	
	
	public PostUAMBDto() {
		super();
	}

	
	public PostUAMBDto(String title) {
		super();
		this.title = title;
	}


	protected PostUAMBDto(Long id, List<PostCommentUAMBDto> comments, String title) {
		super();
		this.id = id;
		this.comments = comments;
		this.title = title;
	}

	/*
	 * Per sincronizzare entrambe le estremità, 
	 * è pratico fornire metodi di supporto lato padre che 
	 * aggiungono/rimuovono entità figlio
	 */

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<PostCommentUAMBDto> getComments() {
		return comments;
	}

	public void setComments(List<PostCommentUAMBDto> comments) {
		this.comments = comments;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void addComment(PostCommentUAMBDto comment) {
		comments.add(comment);
		comment.setPostDto(this);
	}
	
	public void removeComment(PostCommentUAMBDto comment) {
		comments.remove(comment);
		comment.setPostDto(null);
	}
	

}
