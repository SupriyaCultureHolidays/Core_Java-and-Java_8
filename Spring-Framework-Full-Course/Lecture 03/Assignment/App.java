// Q3 (Module 1) — এবার Spring ছাড়া, শুধু plain Maven প্রোজেক্ট দিয়ে Maven-কে হাতে-কলমে
// এক্সপ্লোর করা (SpringBoot.html sec-9 থেকে sec-15)। এই ফাইলটা শুধু ছোট্ট প্রমাণ — আসল কাজ
// হলো IntelliJ + টার্মিনালে Maven-এর ব্যবহার observe করা।
//
// আগে করো (কোনো কোড নয়):
//  1. IntelliJ-তে New Project -> Maven, নিজের একটা groupId/artifactId দাও
//     (যেমন groupId: com.practice, artifactId: MavenExploration)
//  2. mvnrepository.com-এ গিয়ে "org.json:json" সার্চ করো, latest-এর কাছাকাছি একটা
//     স্টেবল version বেছে <dependencies> ট্যাগে বসাও, sync/reload করো
//  3. ~/.m2/repository ফোল্ডারে গিয়ে দেখো org/json/json/<version>/ পাথে .jar
//     ফাইলটা কোথায় নামলো — SpringBoot.html sec-14-এর GAV-ভিত্তিক ফোল্ডার স্ট্রাকচার
//     নিজের চোখে verify করো
//
// package/import নিজের project অনুযায়ী বসবে:
package com.practice;

import org.json.JSONObject;

public class App {

    public static void main(String[] args) {
        // TODO: org.json দিয়ে একটা ছোট্ট JSONObject বানাও (২-৩টা key-value বসাও,
        // যেমন "name", "course") আর সেটা print করো — লক্ষ্য শুধু এটা প্রমাণ করা যে
        // dependency-টা আসলেই classpath-এ এসে গেছে এবং ব্যবহারযোগ্য
    }
}

// এই ফাইল লেখার/রান করার পর টার্মিনাল থেকে (project root-এ গিয়ে) আলাদা আলাদা করে চালাও:
//   mvn validate
//   mvn compile
//   mvn test
//   mvn package
//   mvn install
// প্রতিটার পর target/ ফোল্ডারে (এবং শেষে .m2/repository-তে) কী নতুন তৈরি হলো, একটা
// ছোট নোট (এই ফাইলের নিচে কমেন্ট আকারে বা আলাদা টেক্সট ফাইলে) লিখে রাখো। শেষে
//   mvn clean install
// চালিয়ে দেখাও target/ আগে মুছে গিয়ে আবার ফ্রেশ তৈরি হয় (SpringBoot.html sec-15)।

// ── এখানে নিজের observation নোট লেখো ──
// mvn validate  -> ?
// mvn compile   -> ?
// mvn package   -> ?
// mvn install   -> ?
// mvn clean install -> ?
