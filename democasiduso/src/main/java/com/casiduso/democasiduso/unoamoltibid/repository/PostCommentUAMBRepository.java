package com.casiduso.democasiduso.unoamoltibid.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.casiduso.democasiduso.entities.unoamoltibidir.PostCommentUAMB;

@Repository
public interface PostCommentUAMBRepository  extends CrudRepository<PostCommentUAMB, Long>{

}
