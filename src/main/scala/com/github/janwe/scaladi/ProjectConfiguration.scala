package com.github.janwe.scaladi

import org.scala_tools.subcut.inject.NewBindingModule


object ProjectConfiguration extends NewBindingModule ({ module =>
  import module._
  bind[UserRepository] toInstance new RealUserRepository
})