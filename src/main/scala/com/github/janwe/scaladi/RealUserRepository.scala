package com.github.janwe.scaladi
import com.codahale.jerkson.Json.generate

class RealUserRepository extends UserRepository {
  def getUsers = {
    List(User("janwe", "Jan Fredrik Wedén"), User("mikkelbd", "Mikkel Dan-Rognlie"))
  }
}