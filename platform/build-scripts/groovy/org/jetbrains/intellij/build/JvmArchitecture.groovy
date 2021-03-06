// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.intellij.build

import groovy.transform.CompileStatic

@CompileStatic
enum JvmArchitecture {
  x64("64"), aarch64("aarch64"),

  final String fileSuffix

  JvmArchitecture(String fileSuffix) {
    this.fileSuffix = fileSuffix
  }
}
