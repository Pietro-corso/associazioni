package com.casiduso.democasiduso.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casiduso.democasiduso.entities.moltiaunounid.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	

}
