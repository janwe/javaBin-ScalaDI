package com.github.janwe.scaladi

import org.scala_tools.subcut.inject.{Injectable, BindingModule}
import com.codahale.jerkson.Json.generate


class UserService(implicit val bindingModule: BindingModule) extends Injectable {

  val repository = injectIfBound[UserRepository] {new RealUserRepository}

  def getAllUsers = {
    val users = repository.getUsers
    generate(users)
  }

  def getUserByUid(uid : String) : Option[User] = {
    val users = repository.getUsers

    users.find(_.uid == uid)
  }
}