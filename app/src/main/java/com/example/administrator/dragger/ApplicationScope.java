package com.example.administrator.dragger;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Administrator on 2017/5/24.
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ApplicationScope {
}
