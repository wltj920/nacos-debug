package com.github.wltj920.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User {

    private String id;

    private String name;

    private Boolean enabled;
}
