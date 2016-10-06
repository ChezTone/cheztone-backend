package org.cheztone.backend.model;

import org.springframework.data.annotation.Id;

/**
 * Application user.
 */
public class User {

    @Id
    public String id;

    public String name;

    public String lastName;

}
