// Copyright 2022 Ben Manes. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.github.benmanes.caffeine.cache;

import com.github.benmanes.caffeine.base.UnsafeAccess;
import java.lang.Object;
import java.lang.SuppressWarnings;
import java.lang.ref.ReferenceQueue;

/**
 * <em>WARNING: GENERATED CODE</em>
 *
 * A cache entry that provides the following features:
 * <ul>
 *   <li>RefreshWrite
 *   <li>StrongKeys (inherited)
 *   <li>StrongValues (inherited)
 * </ul>
 *
 * @author ben.manes@gmail.com (Ben Manes)
 */
@SuppressWarnings({"unchecked", "PMD.UnusedFormalParameter", "MissingOverride", "NullAway"})
class PSR<K, V> extends PS<K, V> {
  protected static final long WRITE_TIME_OFFSET = UnsafeAccess.objectFieldOffset(PSR.class, com.github.benmanes.caffeine.cache.LocalCacheFactory.WRITE_TIME);

  volatile long writeTime;

  PSR() {
  }

  PSR(K key, ReferenceQueue<K> keyReferenceQueue, V value, ReferenceQueue<V> valueReferenceQueue,
      int weight, long now) {
    super(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
    UnsafeAccess.UNSAFE.putLong(this, WRITE_TIME_OFFSET, now);
  }

  PSR(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
    super(keyReference, value, valueReferenceQueue, weight, now);
    UnsafeAccess.UNSAFE.putLong(this, WRITE_TIME_OFFSET, now);
  }

  public final long getWriteTime() {
    return UnsafeAccess.UNSAFE.getLong(this, WRITE_TIME_OFFSET);
  }

  public final void setWriteTime(long writeTime) {
    UnsafeAccess.UNSAFE.putLong(this, WRITE_TIME_OFFSET, writeTime);
  }

  public final boolean casWriteTime(long expect, long update) {
    return (writeTime == expect)
        && UnsafeAccess.UNSAFE.compareAndSwapLong(this, WRITE_TIME_OFFSET, expect, update);
  }

  public Node<K, V> newNode(K key, ReferenceQueue<K> keyReferenceQueue, V value,
      ReferenceQueue<V> valueReferenceQueue, int weight, long now) {
    return new PSR<>(key, keyReferenceQueue, value, valueReferenceQueue, weight, now);
  }

  public Node<K, V> newNode(Object keyReference, V value, ReferenceQueue<V> valueReferenceQueue,
      int weight, long now) {
    return new PSR<>(keyReference, value, valueReferenceQueue, weight, now);
  }
}
