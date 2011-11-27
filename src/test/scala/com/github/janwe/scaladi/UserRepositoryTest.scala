package com.github.janwe.scaladi

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class UserRepositoryTest extends FunSuite with ShouldMatchers {

  test("User repository should return real users") {
    val repo : UserRepository = new RealUserRepository

    repo.getUsers should have size  (2)
  }

  test("Test repository should return test users") {
    val testRepo : UserRepository = new TestUserRepository

    testRepo.getUsers should have size (3)
  }

}