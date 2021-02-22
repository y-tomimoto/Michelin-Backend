package com.example.michelin.domain.mapper.entity


data class Review(
  var review_id: String,
  var reviewer_id: String,
  var restaurant_id: String,
  var title: String,
  var comment: String
)


