package com.example.michelin.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {
  @GetMapping("/review")
  fun getHello() :String {
    return "Hello World"
  }
}
