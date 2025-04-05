package com.viniciuszanin.emai_service.core;

public record EmailRequest(String to, String subject, String body) {
}
