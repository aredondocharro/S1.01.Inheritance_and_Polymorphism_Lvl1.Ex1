public class Main {
    public static void main(String[] args) {

    PercussionInstrument drum = new PercussionInstrument("Drum Set",1419.0);
    WindInstrument wind = new WindInstrument("Flute", 2500.0);
    StringInstrument string = new StringInstrument("Acoustic guitar", 40.0);

    drum.play();
    wind.play();
    string.play();

        }
    }
