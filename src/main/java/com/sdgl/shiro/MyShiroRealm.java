package com.sdgl.shiro;

import com.sdgl.service.set.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;


public class MyShiroRealm  extends AuthorizingRealm{
    @Autowired
    private UserService userService;

    //权限认证
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户信息
        String userName=(String)principalCollection.getPrimaryPrincipal();

        //通过用户从数据库或者缓存中获取角色信息
       /* Set<String> roles=getRolesByUserName(userName);*/
        //通过用户从数据库或者缓存中获取权限信息
        Set<String> permissions=getPerminssionByUserName(userName);
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
      /*  simpleAuthorizationInfo.setRoles(roles);*/
        simpleAuthorizationInfo.setStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

    //模拟数据库操作
    private Set<String> getPerminssionByUserName(String userName) {
        return userService.getPermissionByUserName(userName);
    }

   /* //模拟数据库操作
    private Set<String> getRolesByUserName(String userName) {
        Set<String> sets=new HashSet<>();
        sets.add("admin");
        sets.add("user");
        return sets;
    }*/

    //登录认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //从主体传过来的认证信息中获得用户名
        String userName=(String)authenticationToken.getPrincipal();
        System.out.println("shiro"+userName);
        //通过用户名去数据库中获取凭证
        String userPwd=getPasswordByUserName(userName);
        if(userPwd==null){
            return  null;
        }else{
            SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo(userName,userPwd,"MyShiroRealm");
          /*  加盐authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes("Mark"));*/
            return  authenticationInfo;

        }
    }

    //通过用户名去数据库获取密码
    private String getPasswordByUserName(String userName) {
        //从数据库中通过用户名获取密码
        return userService.getPwdByUserName(userName);
        /*return userMap.get("Mark");*/
    }

   /* public static void main(String[] args) {
        Md5Hash md5Hash=new Md5Hash("123456","Mark");
        System.out.println(md5Hash.toString());
    }*/
}
