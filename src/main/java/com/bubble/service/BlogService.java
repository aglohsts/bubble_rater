package com.bubble.service;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bubble.po.Blog;

public interface BlogService {

	Blog getBlog(Integer id);

	Blog getAndConvert(Integer id);

	Page<Blog> listBlog(Pageable pageable, Blog blog);

	Page<Blog> listBlog(Pageable pageable);

	Page<Blog> listBlog(String query, Pageable pageable);

	List<Blog> listRecommendBlogTop(Integer size);

	Map<String, List<Blog>> archiveBlog();

	Long countBlog();

	Blog saveBlog(Blog blog);

	Blog updateBlog(Integer id, Blog blog);

	void deleteBlog(Integer id);

	List<Blog> selectAll();

	List<Blog> selectAllByCriteria(String criteria, String orderBy);

	List<Blog> selectAllByCriteriaByCity(String criteria);

	List<Blog> selectAllByCriteriaByDistrict(String criteria);

	List<Blog> selectAllByCriteriaByName(String criteria);
}
