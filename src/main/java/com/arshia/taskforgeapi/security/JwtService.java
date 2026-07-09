package com.arshia.taskforgeapi.security;


import com.arshia.taskforgeapi.user.entity.User;

public interface JwtService {

    String generateToken(User user);

    String extractUsername(String token);

    boolean isTokenValid(String token, User user);
}
