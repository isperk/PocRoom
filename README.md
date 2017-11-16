# PocRoom
POC using Room for Android.

Add the Google Maven repository

allprojects {
    repositories {
        jcenter()
        maven { url 'https://maven.google.com' }
    }
}

# Add Architecture Components

implementation "android.arch.persistence.room:runtime:1.0.0"
annotationProcessor "android.arch.persistence.room:compiler:1.0.0"
testImplementation "android.arch.persistence.room:testing:1.0.0"
implementation "android.arch.persistence.room:rxjava2:1.0.0"

@isperk