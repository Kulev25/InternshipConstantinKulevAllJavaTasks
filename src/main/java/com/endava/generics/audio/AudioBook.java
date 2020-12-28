package com.endava.generics.audio;

public class AudioBook extends Audio{
    private String language;
    private String voiceActor;

    public AudioBook(int id, String name, Integer serialNumber, String category, Double price, String language, String voiceActor) {
        super(id, name, serialNumber, category, price);
        this.language = language;
        this.voiceActor = voiceActor;
    }

    public String getLanguage() {
        return language;
    }

    public String getVoiceActor() {
        return voiceActor;
    }

}
