package com.github.janwe.scaladi

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class UserRepositoryTest extends FunSuite with ShouldMatchers {

  test("User repository should return real users") {
    val repo : UserRepository = new RealUserRepository

    repo.getUsers should be ("{user: {uid: 'janwe', name: 'Jan Fredrik'}, user: {uid: 'mikkelbd', name: 'Mikkel'}}")
  }

  test("Test repository should return test users") {
    val testRepo : UserRepository = new TestUserRepository

    testRepo.getUsers should be ("{user: {uid: 'test1', name: 'Test 1'}, user: {uid: 'test2', name: 'Test 2'}}")
  }
}