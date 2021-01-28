package com.casiduso.democasiduso.entities.unoamoltibidir;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PostUAMB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * anche se è il lato figlio che controlla la relazione
	 * l'associazione bidirezionale deve avere sempre il lato
	 * padre e il lato figlio sincronizzati
	 */
	@OneToMany(mappedBy = "postUAMB", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PostCommentUAMB> comments = new ArrayList<>();

	private String title;

	
	protected PostUAMB(String title) {
		super();
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public PostUAMB(Long id, List<PostCommentUAMB> comments, String title) {
		super();
		this.id = id;
		this.comments = comments;
		this.title = title;
	}

	public PostUAMB() {
		super();
	}

	public List<PostCommentUAMB> getComments() {
		return comments;
	}

	public void setComments(List<PostCommentUAMB> comments) {
		this.comments = comments;
	}

	/*
	 * Per sincronizzare entrambe le estremità, 
	 * è pratico fornire metodi di supporto lato padre che 
	 * aggiungono/rimuovono entità figlio
	 */

	
	public void addComment(PostCommentUAMB comment) {
		comments.add(comment);
		comment.setPostUAMB(this);
	}
	
	public void removeComment(PostCommentUAMB comment) {
		comments.remove(comment);
		comment.setPostUAMB(null);
	}
}
