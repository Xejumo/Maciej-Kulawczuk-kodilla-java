package com.example.kodilla.spring.reader;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public interface Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata);
}
