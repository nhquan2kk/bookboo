package com.nhquan.identity.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.nhquan.identity.dto.request.RoleRequest;
import com.nhquan.identity.dto.response.RoleResponse;
import com.nhquan.identity.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
