package com.example.michelin.domain.mapper

import com.example.michelin.domain.mapper.entity.Review
import com.example.michelin.domain.mapper.entity.Reviewer
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options

@Mapper
interface ReviewMapper {

  @Insert(
    """
        INSERT INTO reviews
            (review_id,restaurant_id, reviewer_id ,title, comment)
        VALUES
            (#{review_id}, #{restaurant_id}, #{reviewer_id}, #{title}, #{comment})
    """
  )
  fun insert_review(review: Review)

  @Insert(
    """
        INSERT INTO reviewers
            (gender,birthday, reviewer_id)
        VALUES
            (#{gender}, #{birthday}, #{reviewer_id})
    """
  )
  fun insert_reviewer(reviewer: Reviewer)

}
