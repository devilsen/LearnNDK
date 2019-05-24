cmake_minimum_required(VERSION 3.4.1)

aux_source_directory(. BOOK_DIR)
# 生成链接库 除此之外还有 add_execute()
add_library(
        book
        STATIC
        ${BOOK_DIR}
)