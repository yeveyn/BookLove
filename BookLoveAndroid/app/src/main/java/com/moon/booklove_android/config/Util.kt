package com.moon.booklove_android.config

import com.moon.booklove_android.R
import com.moon.booklove_android.config.ApplicationClass.Companion.recommand
import com.moon.booklove_android.config.ApplicationClass.Companion.search
import com.moon.booklove_android.dto.Book
import com.moon.booklove_android.dto.BookCategory

fun getRecomm(): ArrayList<BookCategory> {
    val bookCategory = arrayListOf<BookCategory>()
    for (a in 0..2) {
        val bookList = arrayListOf<Book>()
        for(b in 0..5) {
            val book = Book(b, "Book Title $b", R.drawable.ic_baseline_book_24)
            bookList += book
        }

        bookCategory += BookCategory(a, recommand[a], bookList)
    }

    return bookCategory
}

fun getSearch(): ArrayList<BookCategory> {
    val bookCategory = arrayListOf<BookCategory>()
    for (a in 0..2) {
        val bookList = arrayListOf<Book>()
        for(b in 0..5) {
            val book = Book(b, "Book Title $b", R.drawable.ic_baseline_book_24)
            bookList += book
        }

        bookCategory += BookCategory(a, search[a], bookList)
    }

    return bookCategory
}