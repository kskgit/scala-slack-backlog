package config

import com.google.inject.AbstractModule
import repository.BacklogRepository
import repository.impl.BacklogRepositoryApiV2
import service.MessageShortcutHandleService
import service.impl.MessageShortcutHandleServiceImpl

class DIModule extends AbstractModule {
  override protected def configure(): Unit = {
    bind(classOf[MessageShortcutHandleService]).to(classOf[MessageShortcutHandleServiceImpl])
    bind(classOf[BacklogRepository]).to(classOf[BacklogRepositoryApiV2])
  }
}
