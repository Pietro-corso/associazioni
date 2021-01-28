package com.casiduso.democasiduso.entities.moltiaunounid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PostComment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String review;
	
	// associazione controllata dal lato figlio
	// indipendentemente che la direzione sia unid o bidirezionale
	// un post ha molti commenti
	// hIBERNATE converte lo stato interno del riferimento all'oggetto Post nella
	// post_id valore della chiave foreign key 
	@ManyToOne
	@JoinColumn(name = "post_id")
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

	public PostComment(Long id, String review, Post post) {
		super();
		this.id = id;
		this.review = review;
		this.post = post;
	}

	protected PostComment() {
		super();
	}
	
	
}
