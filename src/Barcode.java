import java.util.Random;

interface Barcode {
    Random rand = new Random();

    int batasAngka = 99999;
    int angkaRandom = rand.nextInt(batasAngka);
}