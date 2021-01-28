package com.casiduso.democasiduso.dto.moltiaunounid;

public class PostDto {

	private Long id;
	
	private String title;

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

	protected PostDto(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public PostDto() {
		super();
	}
	
	
}
