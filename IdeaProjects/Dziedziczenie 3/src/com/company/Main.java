package com.company;

public class Main
{
    public static void main(String[] args)
    {

        Podstawa b1 = new Podstawa();
        b1.wypisz();

        Pochodna d1 = new Pochodna();
        d1.wypisz();
    }
}

class Podstawa
{
    public void wypisz()
    {
        System.out.println("Hello");
    }
}

class Pochodna extends Podstawa
{
    public void wypisz()
    {
        super.wypisz();
        {
            System.out.println("World");
        }
    }
}