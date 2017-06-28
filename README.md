# OneSignal_Notification
Android Nofification Using OneSignal and Firebase

# Create Project Firebase
Ex: AndroidNotification

# Create Project OneSignal 
-Add Server Key from Firebase to OneSignal.
-Add Sender Key from Firebase to OneSignal.

-Add Gradle's OneSignle to pass in Project Android 
compile 'com.onesignal:OneSignal:[3.5.3,4.0.0)'

-Add Key API OneSignal
manifestPlaceholders = [onesignal_app_id: "PUT YOUR ONESIGNAL APP ID HERE",
                              // Project number pulled from dashboard, local value is ignored.
                              onesignal_google_project_number: "REMOTE"]








