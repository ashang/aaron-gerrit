// Copyright (C) 2008 The Android Open Source Project
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

package com.google.gerrit.server.patch;

import com.google.gerrit.server.FileTypeRegistry;
import com.google.gerrit.server.GerritJsonServlet;
import com.google.gerrit.server.GerritServer;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/** Publishes {@link PatchDetailServiceImpl} over JSON. */
@SuppressWarnings("serial")
@Singleton
public class PatchDetailServiceSrv extends GerritJsonServlet {
  private final FileTypeRegistry registry;

  @Inject
  PatchDetailServiceSrv(final GerritServer gs, final FileTypeRegistry ftr) {
    super(gs);
    registry = ftr;
  }

  @Override
  protected Object createServiceHandle() throws Exception {
    return new PatchDetailServiceImpl(server, registry);
  }
}