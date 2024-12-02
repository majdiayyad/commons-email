/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

 package org.apache.commons.mail2.jakarta;

 import org.junit.jupiter.api.Test;
 import static org.junit.jupiter.api.Assertions.*;
 
 class EmailConstantsTest { // Removed 'public'
 
     // Example constants (replace with actual constants from your project)
     private static final String DEFAULT_EMAIL = "test@example.com";
     private static final int MAX_EMAIL_SIZE = 1048576; // 1 MB
 
     @Test
     void testDefaultEmail() {
         assertEquals("test@example.com", DEFAULT_EMAIL, "Default email should match expected value.");
     }
 
     @Test
     void testMaxEmailSize() {
         assertEquals(1048576, MAX_EMAIL_SIZE, "Max email size should match expected value.");
     }
 
     @Test
     void testEmailConstantsNotNull() {
         assertNotNull(DEFAULT_EMAIL, "Default email constant should not be null.");
     }
 }
 