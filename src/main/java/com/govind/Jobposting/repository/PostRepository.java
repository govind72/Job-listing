package com.govind.Jobposting.repository;
import com.govind.Jobposting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PostRepository extends MongoRepository<Post,String>
{

}