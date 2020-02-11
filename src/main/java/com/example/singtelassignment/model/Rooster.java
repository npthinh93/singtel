package com.example.singtelassignment.model;

public class Rooster extends Animal implements SoundAnimal {
    private Language lang = Language.DEFAULT;

    public Rooster() {

    }

    public Rooster(Language lang) {
        this.lang = lang;
    }

    @Override
    public void sound() {
        switch (this.lang) {
            case DANISH:
                System.out.println("kykyliky");
                break;
            case DUTCH:
                System.out.println("kukeleku");
                break;
            case FINNISH:
                System.out.println("kukko kiekuu");
                break;
            case FRENCH:
                System.out.println("cocorico");
                break;
            case GERMAN:
                System.out.println("kikeriki");
                break;
            case GREEK:
                System.out.println("kikiriki");
                break;
            case HEBREW:
                System.out.println("coo-koo-ri-koo");
                break;
            case HUNGARIAN:
                System.out.println("kukuriku");
                break;
            case ITALIAN:
                System.out.println("chicchirichi");
                break;
            case JAPANESE:
                System.out.println("ko-ke-kok-ko-o");
                break;
            case PORTUGUESE:
                System.out.println("cucurucu");
                break;
            case RUSSIAN:
                System.out.println("kukareku");
                break;
            case SWEDISH:
                System.out.println("kuckeliku");
                break;
            case TURKISH:
                System.out.println("kuk-kurri-kuuu");
                break;
            case URDU:
                System.out.println("kuklooku");
                break;
            default:
                System.out.println("Cock-a-doodle-doo");
                break;
        }

    }
}
