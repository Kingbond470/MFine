# MFine

## Cloning of MFine Android Application
MFine- Online Doctor Consultation, Lab Test, Scans

MFine is the one app you need for all your health needs. Consult doctors online & ask your medical questions across 30+ specialities via chat, audio or video call instantly. You can book a health check or a lab test from the comfort of your home. 
Online doctor consultation via MFine is the easiest, most convenient way to address your health concerns.



# Links 

* Blog-Post :- 

# 🔗Open-Source Library

* [Glide](https://github.com/bumptech/glide)
* [Retrofit](https://square.github.io/retrofit/)
* [Firebase](https://firebase.google.com/docs/auth)
* [AutoImageSlider](https://github.com/smarteist/Android-Image-Slider)

# Things we used while making this application

* Kotlin
* GitHub
* Firebase
* Recycler View
* Nagivation Drawer
* Gif ImageView
* VideoView
* Fragments

# Tech Stack ✨

* [Android Studio](https://developer.android.com/studio)
* [Kotlin](https://kotlinlang.org/)

# Clone this Repo To Your System Using Android Studio✨

* Step 1: Open your Android Studio then go to the File > New > Project from Version Control as shown in the below image.
* Step 2: After clicking on the Project from Version Control a pop-up screen will arise like below. In the Version control choose Git from the drop-down menu.
* Step 3: Then at last paste the link in the URL and choose your Directory. Click on the Clone button and you are done.

# Clone this Repo To Your System Using GitBash✨

* Open Git Bash

* If Git is not already installed, it is super simple. Just go to the Git Download Folder and follow the instructions.

* Go to the current directory where you want the cloned directory to be added.

* To do this, input cd and add your folder location. You can add the folder location by dragging the folder to Git bash.

* Go to the page of the repository that you want to clone

* Click on “Clone or download” and copy the URL.

* Use the git clone command along with the copied URL from earlier. $ git clone https://github.com/Kingbond470/MFine.git

* Press Enter. $ git clone https://github.com/Kingbond470/MFine.git
*  Cloning into Git … remote: Counting objects: 13, done. remote: Compressing objects: 100% (13/13), done. remove: Total 13 (delta 1), reused 0 (delta 1) Unpacking objects: 100% (13/13), 
*  Done.

Congratulations, you have created your first local clone from your remote Github repository.

Open Android Studio. Go to File > New > Project From Version Control. 

Copy the link of this repositary. Paste the link in Url Box of Android Studio window and click on "Clone" button.

# Dependencies 
    //General Dependencies
    implementation 'androidx.legacy:legacy-support-v4:1.0.0'
    implementation 'androidx.navigation:navigation-fragment-ktx:2.3.5'
    implementation 'androidx.navigation:navigation-ui-ktx:2.3.5'
    def anko_version = '0.10.0'
    def arch_version = '2.2.0-alpha01'

    implementation 'androidx.core:core-ktx:1.6.0'
    implementation 'androidx.appcompat:appcompat:1.3.1'
    implementation 'com.google.android.material:material:1.3.0-alpha02'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.0'
    testImplementation 'junit:junit:4.+'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

    //Anko
    implementation "org.jetbrains.anko:anko-commons:$anko_version"

    // material UI
    implementation 'com.google.android.material:material:1.5.0-alpha03'

    // Image Slider
    implementation 'com.github.smarteist:autoimageslider:1.4.0'
    
    // Import the Firebase BoM
    implementation platform('com.google.firebase:firebase-bom:28.4.0')


    // Add the dependency for the Firebase SDK for Google Analytics
    // When using the BoM, don't specify versions in Firebase dependencies
    implementation 'com.google.firebase:firebase-analytics-ktx'

    // circular image view 
    implementation 'de.hdodenhof:circleimageview:3.1.0'
    implementation 'com.makeramen:roundedimageview:2.3.0'

    implementation 'androidx.multidex:multidex:2.0.1'

    // glide 
    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
    
    // Retrofit dependency which will be used to make network calls
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    
    // GSON library which is used to convert POJO to JSON and vice versa
    implementation 'com.squareup.retrofit2:converter-gson:2.6.2'
    
    // okhttp library used to observe the api call logs on LogCat
    implementation 'com.squareup.okhttp3:logging-interceptor:4.9.0'

    //shimmer effect
    compile 'com.romainpiel.shimmer:library:1.4.0@aar'
    
    // gif 
    implementation 'pl.droidsonroids.gif:android-gif-drawable:1.2.19'

# Lessons Learnt📚
