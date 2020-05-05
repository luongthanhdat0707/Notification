package com.example.notification25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnTao,mBtnDong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnTao = findViewById(R.id.buttonTaoNotification);
        mBtnDong= findViewById(R.id.buttonDongNotification);
        //1: Giao dien notification : NotificationCompat.Builder
        // 2 : PendingIntent: Sau khi xử lý xong muốn kết nói với intent để xử lý cho việc gì
        // 3 : NotificationManager : Để quản lý tất cả notification
        
        mBtnTao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createNotification();
            }
        });
    }

    private void createNotification() {
    }
}
