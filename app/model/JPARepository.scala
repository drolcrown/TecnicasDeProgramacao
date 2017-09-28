package model

import javax.inject._

import play.db.jpa.JPAApi

@Singleton
class JPARepository {
    var jpaApi : JPAApi
    var DatabaseExecutionContext executionContext

    @Inject
    def JPARepository(api : JPAApi , executionContext : DatabaseExecutionContext) : Unit = {
      this.jpaApi = api
      this.executionContext = executionContext
    }
}
