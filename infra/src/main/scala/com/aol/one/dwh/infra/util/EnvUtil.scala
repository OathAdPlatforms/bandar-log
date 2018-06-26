/*
  ******************************************************************************
  * Copyright 2018, Oath Inc.
  * Licensed under the terms of the Apache Version 2.0 license.
  * See LICENSE file in project root directory for terms.
  ******************************************************************************
*/

package com.aol.one.dwh.infra.util

import scala.util.Try

object EnvUtil {

  private val ENVIRONMENT_VARIABLE = "APP_ENVIRONMENT"

  def getEnvironment: Option[String] = {
    Try(sys.env(ENVIRONMENT_VARIABLE)).toOption
  }
}
