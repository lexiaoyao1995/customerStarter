package com.example.otherway;

import com.example.Application;
import com.example.hello.HelloServiceAutoConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportor implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                Application.class.getName(),
                HelloServiceAutoConfiguration.class.getName()
        };

    }
}