package com.github.janwe.scaladi

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import com.codahale.jerkson.Json

class UserServiceTest extends FunSuite with ShouldMatchers {

  val bindingModule = ProjectConfiguration.modifyBindings { module =>
      module.bind[UserRepository] toInstance new TestUserRepository
      module
  }

  val service = new UserService()(bindingModule)

  test("AllUsers should return all available users") {
      val userString = service.getAllUsers
      val userList = Json.parse[List[User]](userString)

      userString should be ("""[{"uid":"test1","name":"Test 1"},{"uid":"test2","name":"Test 2"},{"uid":"test3","name":"Test 3"}]""")
      userList should have size (3)
  }

  test("GetByName should return one for existing user") {
      service.getUserByUid("test2") should be ("""{"uid":"test2","name":"Test 2"}""")
  }

  test("GetByName should return none for bogus user") {
      service.getUserByUid("jalla") should be ("null")
  }
}