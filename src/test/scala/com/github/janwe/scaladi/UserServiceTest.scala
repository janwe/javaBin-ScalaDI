package com.github.janwe.scaladi

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers


class UserServiceTest extends FunSuite with ShouldMatchers {
  test("AllUsers should return all available users") {
    ProjectConfiguration.modifyBindings { module =>
      module.bind[UserRepository] toInstance new TestUserRepository

      val service = new UserService()(module)

      service.getAllUsers should not be('empty)
    }
  }
}