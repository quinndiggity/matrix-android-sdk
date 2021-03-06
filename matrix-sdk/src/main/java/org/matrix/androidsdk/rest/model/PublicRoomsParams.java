/*
 * Copyright 2016 OpenMarket Ltd
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
package org.matrix.androidsdk.rest.model;

/**
 * Class to pass parameters to get the public rooms list
 */
public class PublicRoomsParams {
    /** The remote server to query for the room list. **/
    public String server;

    /** Maximum number of entries to return **/
    public Integer limit;

    /** token to paginate from **/
    public String since;

    /** Filter parameters **/
    public PublicRoomsFilter filter;
}
