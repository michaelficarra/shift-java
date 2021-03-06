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

package com.shapesecurity.shift.ast.expression;

import com.shapesecurity.shift.ast.Expression;
import com.shapesecurity.shift.ast.operators.Precedence;

import org.jetbrains.annotations.NotNull;

public abstract class MemberExpression extends LeftHandSideExpression {
  @NotNull
  public final Expression object;

  MemberExpression(@NotNull Expression object) {
    super();
    this.object = object;
  }

  @Override
  public Precedence getPrecedence() {
    return this.object instanceof CallExpression || this.object instanceof MemberExpression ?
           this.object.getPrecedence() : Precedence.MEMBER;
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof MemberExpression && this.object.equals(((MemberExpression) obj).object);
  }

  @NotNull
  public Expression getObject() {
    return this.object;
  }
}
