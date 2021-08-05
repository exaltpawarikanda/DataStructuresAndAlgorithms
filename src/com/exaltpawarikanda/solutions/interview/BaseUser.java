package com.exaltpawarikanda.solutions.interview;

/**
 * Created by Exalt Pawarikanda on 8/5/21
 */
public class BaseUser  {
    public static int createdUsersCount;

    public BaseUser() {
        createdUsersCount = createdUsersCount + 1;
    }
}
