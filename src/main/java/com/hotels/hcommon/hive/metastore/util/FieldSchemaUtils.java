/**
 * Copyright (C) 2018 Expedia Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hotels.hcommon.hive.metastore.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hive.metastore.api.FieldSchema;

public final class FieldSchemaUtils {

  private FieldSchemaUtils() {}

  public static List<String> getFieldNames(List<FieldSchema> partitionKeys) {
    List<String> names = new ArrayList<>(partitionKeys.size());
    for (FieldSchema field : partitionKeys) {
      names.add(field.getName());
    }
    return names;
  }

}
