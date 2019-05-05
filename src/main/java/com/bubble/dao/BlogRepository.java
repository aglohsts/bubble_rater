package com.bubble.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.bubble.po.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer>, JpaSpecificationExecutor<Blog> {

//	@Query("select b from Blog b where b.recommend = true")
//	List<Blog> findTop(Pageable pageable);
//
//	@Query("select b from Blog b where b.title like ?1 or b.content like ?1")
//	Page<Blog> findByQuery(String query, Pageable pageable);
//
//	@Transactional
//	@Modifying
//	@Query("update Blog b set b.views = b.views+1 where b.id = ?1")
//	int updateViews(Long id);
//
//	@Query("select function('date_format',b.updateTime,'%Y') as year from Blog b group by function('date_format',b.updateTime,'%Y') order by year desc ")
//	List<String> findGroupYear();
//
//	@Query("select b from Blog b where function('date_format',b.updateTime,'%Y') = ?1")
//	List<Blog> findByYear(String year);

	@Query("select b from Blog b order by bubbleRate desc")
	List<Blog> selectBlogOrderByBubbleRate();

	@Query("select b from Blog b order by teaRate desc")
	List<Blog> selectBlogOrderByTeaRate();

	@Query("select b from Blog b order by createdDtm desc")
	List<Blog> selectBlogOrderByCreatedTime();
	
	//限制筆數
	@Query("select b from Blog b where publish = '1' order by totalRate desc,godfeelingRate")
	List<Blog> selectTopTwelveBlogOrderByTotalRate(Pageable pageable);
	@Query("select b from Blog b where publish = '1' order by totalRate desc,godfeelingRate")
	List<Blog> selectSixMore(Pageable pageable);

	@Query("select b from Blog b where publish = '1' and storeCity=:criteria order by totalRate desc,godfeelingRate ")
	List<Blog> selectAllByCriteriaByCity(@Param("criteria") String criteria);

	@Query("select b from Blog b where publish = '1' and storeBrand=:criteria order by totalRate desc,godfeelingRate ")
	List<Blog> selectAllByCriteriaByName(@Param("criteria") String criteria);

	@Query("select b from Blog b where publish = '1' and storeDistrict=:criteria order by totalRate desc,godfeelingRate ")
	List<Blog> selectAllByCriteriaByDistrict(@Param("criteria") String criteria);

	@Query("select b from Blog b where publish = '1' and storeCity=:criteria order by totalRate desc,godfeelingRate ")
	List<Blog> selectBlogOrderByCriteriaStoreCity(@Param("criteria") String criteria);
	@Query("select COUNT(*) from Blog b where publish = '1'")
	Integer countBlog();

	@Transactional
	@Modifying
	@Query("update Blog b set b.bubbleRatePR = :score where blogId=:id")
	int updateBubbleRatePR(@Param("score") float score, @Param("id") int id);

	@Transactional
	@Modifying
	@Query("update Blog b set b.teaRatePR =:score where blogId=:id")
	int updateTeaRatePR(@Param("score") float score, @Param("id") int id);

	@Transactional
	@Modifying
	@Query("update Blog b set b.latest =:latest where blogId=:id")
	void updateLatest(@Param("latest") boolean b, @Param("id") int id);

	@Transactional
	@Modifying
	@Query("update Blog b set b.totalRate =:rate where blogId=:id")
	void updateTotalRate(@Param("rate") float rate, @Param("id") int id);



	
	
	


}