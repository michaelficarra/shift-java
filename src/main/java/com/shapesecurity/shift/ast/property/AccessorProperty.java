/*
 * Copyright 2014 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.shapesecurity.shift.ast.property;

import com.shapesecurity.shift.ast.FunctionBody;

import org.jetbrains.annotations.NotNull;

public abstract class AccessorProperty extends ObjectProperty {
  @NotNull
  public final FunctionBody body;

  AccessorProperty(@NotNull PropertyName name, @NotNull FunctionBody body) {
    super(name);
    this.body = body;
  }

  @NotNull
  public FunctionBody getBody() {
    return this.body;
  }
}
