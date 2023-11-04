package com.govind.Jobposting.repository;
import com.govind.Jobposting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}