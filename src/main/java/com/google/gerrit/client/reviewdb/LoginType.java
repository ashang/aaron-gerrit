// Copyright (C) 2009 The Android Open Source Project
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.gerrit.client.reviewdb;

public enum LoginType {
  /** Login relies upon the OpenID standard: {@link "http://openid.net/"} */
  OPENID,

  /**
   * Login relies upon the container/web server security.
   * <p>
   * The container or web server must populate an HTTP header with the some
   * user token. Gerrit will implicitly trust the value of this header to
   * supply the unique identity.
   */
  HTTP,

  /** Development mode to enable becoming anyone you want. */
  DEVELOPMENT_BECOME_ANY_ACCOUNT;
}
