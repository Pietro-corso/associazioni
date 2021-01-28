package com.casiduso.democasiduso.entities.unoamoltibidir;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * In un'associazione bidirezionale, 
 * solo un lato può controllare la relazione di tabella sottostante
 * 
 * Per la mappatura bidirezionale a molti, 
 * è l'associazione Many To One lato bambino responsabile
 * mantenendo il valore della colonna della chiave esterna 
 * sincronizzato con il contesto di persistenza in memoria. Questo
 * è il motivo per cui la relazione bidirezionale OneToMany deve 
 * definire l'attributo mappedBy, 
 * che indica che rispecchia solo il mapping lato figlio ManyToOne
 * @author E002097
 *
 */
@Entity
public class PostCommentUAMB {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String review;
	
	// associazione controllata dal lato figlio
	// indipendentemente che la direzione sia unid o bidirezionale
	// un post ha molti commenti
	// hIBERNATE converte lo stato interno del riferimento all'oggetto Post nella
	// post_id valore della chiave foreign key 
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "postUAMB_id")
	private PostUAMB postUAMB;

	
	protected PostCommentUAMB(String review) {
		super();
		this.review = review;
	}

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

	

	public PostUAMB getPostUAMB() {
		return postUAMB;
	}

	public void setPostUAMB(PostUAMB postUAMB) {
		this.postUAMB = postUAMB;
	}

	public PostCommentUAMB(Long id, String review, PostUAMB postUAMB) {
		super();
		this.id = id;
		this.review = review;
		this.postUAMB = postUAMB;
	}

	public PostCommentUAMB() {
		super();
	}
	public void addComment(PostCommentUAMB comment) {
		this.postUAMB = comment.getPostUAMB();
		
	}
	
}

