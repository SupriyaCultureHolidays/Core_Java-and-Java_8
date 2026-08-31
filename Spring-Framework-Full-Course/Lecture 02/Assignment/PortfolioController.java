// Q2 (Module 1) — কোর্সের নিজের demo/HelloController-এর হুবহু কপি না করে ভিন্ন domain:
// একটা ছোট্ট "Portfolio Info API"। লক্ষ্য: নিজে হাতে Spring Initializr দিয়ে গোটা
// project generate করা (এই ফাইলটা শুধু Controller ক্লাসের রেফারেন্স, পুরো project না)।
//
// আগে করো (কোনো কোড নয়, IDE/ব্রাউজারে):
//  1. start.spring.io -তে যাও — Project: Maven, Language: Java, Packaging: Jar,
//     Java version: 21 (বা তোমার সিস্টেমে যেটা আছে), Dependency: Spring Web যোগ করো
//  2. Generate করে zip unzip করো, IntelliJ-তে ওপেন করো
//  3. src/main/java/<তোমার-package>/-এর ভেতরে এই ফাইলটার মতো একটা Controller বানাও
//
// package আর import নিজের project অনুযায়ী বসবে, যেমন:
package com.example.portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController — এই annotation বসাও (মনে করো কেন লাগে: এটা ছাড়া Spring জানবে না
// এই ক্লাসটা API endpoint-এর জন্য, শুধু একটা সাধারণ Java class হয়ে থাকবে)
public class PortfolioController {

    // @GetMapping("home") বসাও এই মেথডের উপর
    // — একটা String রিটার্ন করবে, ভেতরে <h1>Welcome to My Portfolio</h1>-এর মতো
    //   HTML ট্যাগ থাকবে (মনে করো: কেন <h1> লিখলে ব্রাউজার সেটাকে heading হিসেবে
    //   render করে, plain text হিসেবে না)
    public String home() {
        return null; // TODO
    }

    // @GetMapping("about") বসাও
    // — নিজের সম্পর্কে ১-২ লাইন <p> ট্যাগে রিটার্ন করো
    public String about() {
        return null; // TODO
    }

    // @GetMapping("skills") বসাও
    // — কমা দিয়ে skill-এর তালিকা <p> ট্যাগে রিটার্ন করো
    public String skills() {
        return null; // TODO
    }

    // Bonus (ঐচ্ছিক) — @GetMapping("contact") বসিয়ে একটা চতুর্থ endpoint যোগ করো
}

// রান করার পর এবং প্রতিটা endpoint ব্রাউজারে হিট করার পর:
// application.properties -এ server.port=9090 (বা অন্য কোনো নম্বর) বসিয়ে অ্যাপ্লিকেশন
// আবার রান করো, দেখাও নতুন পোর্টেই কাজ করছে আর পুরনো পোর্টে "site can't be reached"
// দেখাচ্ছে — SpringBoot.html sec-8-এ যেটা বলা হয়েছে সেটাই নিজে হাতে verify করা।
