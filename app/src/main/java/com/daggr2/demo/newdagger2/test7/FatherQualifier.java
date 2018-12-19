package com.daggr2.demo.newdagger2.test7;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
//限定符区分同类型参数，在inject或者module提供依赖实例时进行注入
public @interface FatherQualifier {

}
