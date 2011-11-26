package com.github.janwe.scaladi
import com.codahale.jerkson.Json._

class TestUserRepository extends UserRepository {
  def getUsers = {
    val users = List(User("test1", "Test 1"), User("test2", "Test 2"))
    generate(users)
  }
}