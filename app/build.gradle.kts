

/*
 * Copyright (C) 2015 Antonio Leiva
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdkVersion(Config.Android.compileSdkVersion)
    buildToolsVersion(Config.Android.buildToolsVersion)

    defaultConfig {
        applicationId = Config.Android.applicationId
        minSdkVersion(Config.Android.minSdkVersion)
        targetSdkVersion(Config.Android.targetSdkVersion)
        versionCode = Config.Android.versionCode
        versionName = Config.Android.versionName

        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles("proguard-rules.pro")
        }
    }




}

dependencies {


    implementation(Config.Libs.androidx)
    implementation(Config.Libs.android_appcompat)
    implementation(Config.Libs.android_material)
    implementation(Config.Libs.android_constraintlayout)



    implementation(Config.Libs.kotlin_std)
//    implementation(Config.Libs.appcompat)
//    implementation(Config.Libs.recyclerview)
//    implementation(Config.Libs.cardview)
//    implementation(Config.Libs.palette)
//    implementation(Config.Libs.design)
//    implementation(Config.Libs.eventbus)
//    implementation(Config.Libs.picasso)
//    implementation(Config.Libs.okhttp)
//    implementation(Config.Libs.okhttp_interceptor)
//    implementation(Config.Libs.retrofit)
//    implementation(Config.Libs.retrofit_gson)
//    implementation(Config.Libs.jobqueue)
//    implementation(Config.Libs.anko_sdk15)
//    implementation(Config.Libs.anko_support)
//    implementation(Config.Libs.anko_appcompat)
//    implementation(Config.Libs.anko_design)
//    implementation(Config.Libs.anko_cardview)
//    implementation(Config.Libs.anko_recyclerview)
//    kapt(Config.Libs.dagger_compiler)
//    implementation(Config.Libs.dagger)

    testCompile(Config.TestLibs.junit)
    testCompile(Config.TestLibs.mockito)

    androidTestCompile(Config.TestLibs.mockito)
    androidTestCompile(Config.TestLibs.dexmaker)
    androidTestCompile(Config.TestLibs.dexmaker_mockito)
//    androidTestCompile(Config.TestLibs.annotations)
//    androidTestCompile(Config.TestLibs.espresso)
}