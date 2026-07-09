package com.arshia.taskforgeapi.auth.service;

import com.arshia.taskforgeapi.auth.dto.request.LoginRequest;
import com.arshia.taskforgeapi.auth.dto.request.RegisterRequest;
import com.arshia.taskforgeapi.auth.dto.response.AuthenticationResponse;

public interface AuthService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse login(LoginRequest request);
}
