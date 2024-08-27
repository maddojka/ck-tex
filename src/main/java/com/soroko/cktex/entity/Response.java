package com.soroko.cktex.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * @author yuriy.soroko
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Response {
    int current;
}
