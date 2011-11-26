package com.github.janwe.scaladi

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class UserRepositoryTest extends FunSuite with ShouldMatchers {

  test("User repository should return real users") {
    val repo : UserRepository = new RealUserRepository

    repo.getUsers should be ("""[{"uid":"janwe","name":"Jan Fredrik Wedén"},{"uid":"mikkelbd","name":"Mikkel Dan-Rognlie"}]""")
  }

  test("Test repository should return test users") {
    val testRepo : UserRepository = new TestUserRepository

    testRepo.getUsers should be ("""[{"uid":"test1","name":"Test 1"},{"uid":"test2","name":"Test 2"}]""")
  }

}