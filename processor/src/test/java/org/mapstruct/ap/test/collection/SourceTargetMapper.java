/**
 *  Copyright 2012-2013 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.test.collection;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mappers;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface SourceTargetMapper {

    public static SourceTargetMapper INSTANCE = Mappers.getMapper( SourceTargetMapper.class );

    @Mappings({
        @Mapping(source = "integerList", target = "integerCollection"),
        @Mapping(source = "integerSet", target = "set"),
        @Mapping(source = "anotherIntegerSet", target = "anotherStringSet")
    })
    Target sourceToTarget(Source source);

    Source targetToSource(Target target);

    Set<String> integerSetToStringSet(Set<Integer> integers);

    Set<Integer> stringSetToIntegerSet(Set<String> strings);

    Set<String> colourSetToStringSet(Set<Colour> colours);

    Set<Colour> stringSetToColourSet(Set<String> colours);
}
