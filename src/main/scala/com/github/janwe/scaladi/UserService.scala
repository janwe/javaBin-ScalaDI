package com.github.janwe.scaladi

import org.scala_tools.subcut.inject.{Injectable, BindingModule}


class UserService(implicit val bindingModule: BindingModule) extends Injectable {

  val repository = injectIfBound[UserRepository] {new RealUserRepository}

  def getAllUsers = {
    repository.getUsers
  }
}