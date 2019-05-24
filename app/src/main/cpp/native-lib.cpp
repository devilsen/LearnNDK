#include <jni.h>
#include <string>
#include "Calculator.h"
#include "book/test.h"


extern "C" JNIEXPORT jstring JNICALL
Java_me_sam_ndktest_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}

extern "C" JNIEXPORT jint JNICALL
Java_me_sam_ndktest_NDKTest_add(JNIEnv *env, jobject instance, jint a, jint b) {

    Calcu calculator;
    return calculator.add(1, 1);

}extern "C"
JNIEXPORT jstring JNICALL
Java_me_sam_ndktest_NDKTest_getBook(JNIEnv *env, jobject instance) {

    string book_name = getBook();

    return env->NewStringUTF(book_name.c_str());
}