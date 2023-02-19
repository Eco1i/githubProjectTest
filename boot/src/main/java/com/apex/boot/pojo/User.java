package com.apex.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ecoli
 * @date 23/2/19 0:47
 */
@Data
@AllArgsConstructor
public class User {
    private String name;
    private Integer age;
}
