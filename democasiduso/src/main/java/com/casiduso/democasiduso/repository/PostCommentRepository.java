package com.casiduso.democasiduso.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casiduso.democasiduso.entities.moltiaunounid.PostComment;

@Repository
public interface PostCommentRepository extends CrudRepository<PostComment, Long> {

	
}
