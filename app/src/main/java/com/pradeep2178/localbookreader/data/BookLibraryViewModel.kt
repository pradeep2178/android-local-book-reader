package com.pradeep2178.localbookreader.data

import android.content.Context
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import kotlinx.coroutines.flow.Flow

class BookRepository(private val context: Context) {
    private val db = AppDatabase.getInstance(context)
    private val dao = db.bookDao()

    fun observeBooks(): Flow<List<BookEntity>> = dao.getAllBooks()

    suspend fun addBook(title: String, fileUri: String) {
        dao.insert(
            BookEntity(
                title = title,
                fileUri = fileUri,
                pageCount = 0,
                indexed = false,
            )
        )
    }

    fun enqueueIndexing(fileUri: String) {
        val work = OneTimeWorkRequestBuilder<PdfIndexWorker>()
            .setInputData(workDataOf("book_uri" to fileUri))
            .build()

        WorkManager.getInstance(context).enqueue(work)
    }
}
