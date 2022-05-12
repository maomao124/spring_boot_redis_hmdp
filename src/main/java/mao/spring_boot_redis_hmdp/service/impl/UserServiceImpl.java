package mao.spring_boot_redis_hmdp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import mao.spring_boot_redis_hmdp.entity.User;
import mao.spring_boot_redis_hmdp.mapper.UserMapper;
import mao.spring_boot_redis_hmdp.service.IUserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService
{

}
