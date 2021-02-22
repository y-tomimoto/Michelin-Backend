package com.example.michelin.controllers

import com.example.michelin.domain.mapper.ReviewMapper
import com.example.michelin.domain.mapper.entity.Review
import com.example.michelin.domain.mapper.entity.Reviewer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.sql.Date

@RestController
class SampleController {
  @Autowired
  lateinit var reviewMapper: ReviewMapper

  @GetMapping("/review")
  fun getHello(): String {
    val reviewer =
      Reviewer(reviewer_id = "test", gender = 'M', birthday = Date(System.currentTimeMillis())  )
    reviewMapper.insert_reviewer(reviewer)

    val review =
      Review(review_id = "test", restaurant_id = "test", reviewer_id = "test", title = "test", comment = "test")
    reviewMapper.insert_review(review)
    return "Hello World"
  }
}
