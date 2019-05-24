//
// Created by Devilsen on 2019-05-23.
//

#include <string>
#include "book_manager.h"
#include "test.h"

using namespace std;

string getBook() {
    auto *manager = new Book_Manager;
    return manager->get_book();
}