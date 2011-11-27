package com.github.janwe.scaladi

trait UserRepository {
  def getUsers : List[User]
}