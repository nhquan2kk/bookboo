package com.nhquan.identity.mapper;

import com.nhquan.identity.dto.request.ProfileCreationRequest;
import com.nhquan.identity.dto.request.UserCreationRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProfileMapper {
    ProfileCreationRequest toProfileCreationRequest(UserCreationRequest request);
}
