package io.github.xyzc1988.shiro.chapter12.dao;


import io.github.xyzc1988.shiro.chapter12.entity.Permission;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public interface PermissionDao {

    public Permission createPermission(Permission permission);

    public void deletePermission(Long permissionId);

}
