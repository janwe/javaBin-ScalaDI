package com.github.janwe.scaladi


class TestUserRepository extends UserRepository {
  def getUsers = {
    "{user: {uid: 'test1', name: 'Test 1'}, user: {uid: 'test2', name: 'Test 2'}}"
  }
}