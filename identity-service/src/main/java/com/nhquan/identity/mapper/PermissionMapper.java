package com.nhquan.identity.mapper;

import org.mapstruct.Mapper;

import com.nhquan.identity.dto.request.PermissionRequest;
import com.nhquan.identity.dto.response.PermissionResponse;
import com.nhquan.identity.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
