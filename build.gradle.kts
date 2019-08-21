/*
 * Copyright (c) 2012-2019 Arne Schwabe
 * Distributed under the GNU GPL v2 with additional terms. For full terms see the file doc/LICENSE.txt
 */


buildscript {
    var kotlin_version: String by extra
    kotlin_version = "1.3.41"
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.0")//原始为3.4.2,将升级到3.5.0
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")   //classpath(kotlinModule("gradle-plugin", kotlin_version)
    }
}


repositories {
    google()
}