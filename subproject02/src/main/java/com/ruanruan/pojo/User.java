package com.ruanruan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Ecoli
 * @date 23/2/19 10:21
 */
@Data
@AllArgsConstructor
public class User {

    private String id;
    private String name;
    private Integer age;

}
