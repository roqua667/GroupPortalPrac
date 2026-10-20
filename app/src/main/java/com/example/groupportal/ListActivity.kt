package com.example.groupportal
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ListActivity : AppCompatActivity() {
    private val TAG = "ListActivityLog"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        Log.d(TAG, "onCreate: Экран списка загружен")

        val tvGreeting = findViewById<TextView>(R.id.tvGreeting)
        val userName = intent.getStringExtra("USER_NAME") ?: "Гость"
        tvGreeting.text = "Здравствуйте, $userName!\nСтуденты группы:"

        val btnStudent1 = findViewById<Button>(R.id.btnStudent1)
        val btnStudent2 = findViewById<Button>(R.id.btnStudent2)

        btnStudent1.setOnClickListener {
            openDetail("Асанов Айдос", 95)
        }

        btnStudent2.setOnClickListener {
            openDetail("Иванов Сергей", 88)
        }
    }

    private fun openDetail(studentName: String, grade: Int) {
        Log.i(TAG, "Переход к карточке студента: $studentName")
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("EXTRA_STUDENT", studentName)
        intent.putExtra("EXTRA_GRADE", grade)
        startActivity(intent)
    }
}