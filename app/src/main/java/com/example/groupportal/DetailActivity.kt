package com.example.groupportal
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    private val TAG = "DetailActivityLog"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        Log.d(TAG, "onCreate: Карточка студента открыта")

        val studentName = intent.getStringExtra("EXTRA_STUDENT") ?: "Неизвестно"
        val grade = intent.getIntExtra("EXTRA_GRADE", 0)

        findViewById<TextView>(R.id.tvStudentName).text = studentName
        findViewById<TextView>(R.id.tvGrade).text = "Оценка: $grade баллов"

        findViewById<Button>(R.id.btnBack).setOnClickListener {
            Log.i(TAG, "Нажата кнопка Назад")
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: Карточка закрыта")
    }
}