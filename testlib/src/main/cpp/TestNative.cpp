#include <jni.h>
#include <string>
#include "include/test.h"
//
// Created by Devilsen on 2019-05-23.
//

extern "C"
JNIEXPORT jstring JNICALL
Java_me_sam_testlib_TestNativeActivity_getBook(JNIEnv *env, jobject instance) {

    std::string bookName = getBook();

    return env->NewStringUTF(bookName.c_str());
}