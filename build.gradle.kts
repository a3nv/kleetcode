/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our samples at https://docs.gradle.org/8.1.1/samples
 */
plugins {
 kotlin("jvm") version "1.8.20"
}

repositories {
 mavenCentral()
}

tasks {
 sourceSets {
  main {
   java.srcDirs("src")
  }
 }
 
 wrapper {
  gradleVersion = "8.1.1"
 }
}