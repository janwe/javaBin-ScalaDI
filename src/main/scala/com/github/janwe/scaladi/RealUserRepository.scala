package com.github.janwe.scaladi


class RealUserRepository extends UserRepository {
      def getUsers = {
        "{user: {uid: 'janwe', name: 'Jan Fredrik'}, user: {uid: 'mikkelbd', name: 'Mikkel'}}"
      }
}