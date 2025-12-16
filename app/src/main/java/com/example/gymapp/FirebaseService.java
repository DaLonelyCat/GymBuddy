package com.example.gymapp;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FirebaseService extends FirebaseMessagingService{

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);

        RemoteMessage.Notification notification = message.getNotification();
        String title = notification.getTitle();
        String desc = notification.getBody();

        showNotification(title,desc);
    }


    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("FCM Token: ", token);
    }

    void showNotification(String title, String desc){
        String channelId = "channel_id";
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel(
                    channelId,"Channel",NotificationManager.IMPORTANCE_HIGH
            );
            manager.createNotificationChannel(channel);
        }
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(
                this,0, intent,
                PendingIntent.FLAG_ONE_SHOT | PendingIntent.FLAG_IMMUTABLE
        );

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,channelId)
                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentTitle(title)
                .setContentText(desc)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent);


        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {

            return;
        }
        NotificationManagerCompat.from(this).notify(1, builder.build());

    }
}

