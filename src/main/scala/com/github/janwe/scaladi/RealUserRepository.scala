package com.github.janwe.scaladi

class RealUserRepository extends UserRepository {
  def getUsers = {
    List(User("janwe", "Jan Fredrik Wedén"), User("mikkelbd", "Mikkel Dan-Rognlie"))
  }
}