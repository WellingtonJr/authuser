package com.ead.authuser.services;

import java.util.UUID;

import com.ead.authuser.models.UserCourseModel;
import com.ead.authuser.models.UserModel;

public interface UserCourseService {

    boolean existsByUserAndCourseId(UserModel userModel, UUID userId);

    UserCourseModel save(UserCourseModel userCourseModel);

}
