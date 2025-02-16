package com.mosi.kubernetesdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class LoveController {

    private final List<String> backgroundImages = Arrays.asList(
            "/images/background1.jpeg",
            "/images/background2.jpeg");

    private final List<String> lovePhrases = Arrays.asList(
            "My Sweet Honey, even after 5 years apart, my love for you grows stronger every day. You are my forever.",
            "My Sweet Honey, you are the girl I fell in love with at 17, and you are still the only one who holds my heart.",
            "Distance has only made me realize how much you mean to me. I love you more than words can express, My Sweet Honey.",
            "My Sweet Honey, every day without you feels incomplete. I can't wait to finally hold you in my arms.",
            "You are my first love, my only love, and my forever love. I miss you, My Sweet Honey.",
            "My Sweet Honey, no matter how far apart we are, my heart always finds its way back to you.",
            "I fell in love with you at 17, and I’ve loved you every single day since. You are my soulmate, My Sweet Honey.",
            "My Sweet Honey, the thought of you keeps me going. I can't wait for the day we are together again.",
            "You are my past, my present, and my future. I love you, My Sweet Honey, more than anything in this world.",
            "My Sweet Honey, every moment without you feels like a lifetime. I miss you more than words can say.",
            "You are my dream, my hope, and my everything. I love you, My Sweet Honey, now and always.",
            "My Sweet Honey, even after all these years, my heart still skips a beat when I think of you.",
            "You are the reason I believe in love. I can't wait to see you again, My Sweet Honey.",
            "My Sweet Honey, you are my home, no matter where I am. I love you more than anything.",
            "Every day, I thank the universe for bringing you into my life. I love you, My Sweet Honey, forever and always.",
            "My Sweet Honey, you are my sunshine on the darkest days. I can't wait to see your smile again.",
            "You are my everything, My Sweet Honey. I love you more than words can ever express.",
            "My Sweet Honey, no matter how much time passes, my love for you only grows stronger.",
            "You are my first thought in the morning and my last thought at night. I love you, My Sweet Honey.",
            "My Sweet Honey, you are my heart, my soul, and my everything. I can't wait to be with you again."
    );
    private final Random random = new Random();

    @GetMapping("/mylove/honey")
    public String getRandomLovePhrase(Model model) {
        // Select a random love phrase
        String randomPhrase = lovePhrases.get(random.nextInt(lovePhrases.size()));

        // Select a random background image
        String randomBackground = backgroundImages.get(random.nextInt(backgroundImages.size()));

        // Add attributes to the model
        model.addAttribute("lovePhrase", randomPhrase);
        model.addAttribute("hannaName", "Hanna");
        model.addAttribute("musieName", "Musie");
        model.addAttribute("backgroundImage", randomBackground);

        return "index";
    }
}