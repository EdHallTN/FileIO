import jodd.json.JsonSerializer;
import jodd.json.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Survey {
    public static Scanner scanner = new Scanner(System.in);
    public static Participant participant = new Participant();


    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, participant.");


        try {
            participant = loadSurvey();
            System.out.println(participant);
            System.out.println("Change your survey information if you like.");
        } catch (FileNotFoundException e) {
            System.out.println("Starting new survey.");
        }

        participant.chooseName();
        participant.chooseSong();
        participant.chooseArtist();
        participant.chooseAlbum();
        participant.chooseGenre();
        participant.chooseYear();
        saveSurvey();
        loadSurvey();

    }

    public static void saveSurvey() throws IOException {
        JsonSerializer s = new JsonSerializer();
        String json = s.serialize(participant);
        File f = new File("survey.json");
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();
    }

    public static Participant loadSurvey() throws FileNotFoundException {
        File f = new File("survey.json");
        Scanner s = new Scanner(f);
        s.useDelimiter("\\Z");
        String contents = s.next();
        s.close();
        JsonParser p = new JsonParser();
        return p.parse(contents, Participant.class);

    }

}

