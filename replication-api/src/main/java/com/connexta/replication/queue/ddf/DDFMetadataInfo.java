/**
 * Copyright (c) Connexta
 *
 * <p>This is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or any later version.
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details. A copy of the GNU Lesser General Public
 * License is distributed along with this program and can be found at
 * <http://www.gnu.org/licenses/lgpl.html>.
 */
package com.connexta.replication.queue.ddf;

import com.connexta.replication.queue.MetadataInfo;

/**
 * Extension to the {@link MetadataInfo} class which provides additional collected information that
 * can be useful for a worker processing an associated task.
 */
public interface DDFMetadataInfo extends MetadataInfo {
  /**
   * The class format for the raw data defining the metadata.
   *
   * @return the class for the raw data
   */
  public Class<?> getDataClass();

  /**
   * The raw data defining the metadata.
   *
   * @return the raw data
   */
  public Object getData();
}
