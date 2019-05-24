cmake_minimum_required(VERSION 3.4.1)

# 1. 引入库名称
add_library(
        native-lib
        SHARED
        IMPORTED
)
# 2. 指定引入库路径
set_target_properties(native-lib PROPERTIES IMPORTED_LOCATION
        ${CMAKE_CURRENT_SOURCE_DIR}/../../../libs/${ANDROID_ABI}/libnative-lib.so)

# 3. 引入头文件
include_directories( include/ )

add_library(test-lib
        SHARED
        TestNative.cpp)

find_library(
        log-lib
        log)

target_link_libraries(
        test-lib
        native-lib
        ${log-lib}
)