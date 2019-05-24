
cmake_minimum_required(VERSION 3.4.1)

# 将目录中的所有文件，设定到SOURCE_DIR变量中
aux_source_directory(. SOURCE_DIR)

add_library(
        native-lib
        SHARED
        ${SOURCE_DIR}
)


find_library(
        log-lib
        log)

# 编译子目录CMake文件  添加成功后，指定目录会变成蓝色
add_subdirectory(book)
# 添加链接库
target_link_libraries(
        native-lib
        book
        ${log-lib})

message("-------以下是调试命令-------")
message("CMAKE_COMMAND ${CMAKE_COMMAND}")

get_target_property(VAR native-lib LIBRARY_OUTPUT_DIRECTORY)
message("LIBRARY_OUTPUT_DIRECTORY : ${VAR}")

message("HOME : $ENV{HOME}")
message("-------调试命令结束-------")

#message(${LIBRARY_OUTPUT_DIRECTORY})



# 生成的.so文件位于，app/build/intermediates/cmake/debug/obj/${abi} 文件夹下
# 生成的.so文件位于，app/build/intermediates/transforms/stripDebugSymbol/release/0/lib/${abi} 文件夹下

