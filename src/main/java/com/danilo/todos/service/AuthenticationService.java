package com.danilo.todos.service;

import com.danilo.todos.dto.request.AuthenticationRequest;
import com.danilo.todos.dto.request.RegisterRequest;
import com.danilo.todos.dto.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest authenticationRequest);
}
