package com.nhquan.profile.mapper;

import org.mapstruct.Mapper;

import com.nhquan.profile.dto.request.ProfileCreationRequest;
import com.nhquan.profile.dto.response.UserProfileReponse;
import com.nhquan.profile.entity.UserProfile;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileCreationRequest request);

    UserProfileReponse toUserProfileReponse(UserProfile entity);
}
