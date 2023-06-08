/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minijuegos.Ordenamiento.Info;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;

/**
 *
 * @author Alisser
 */
public class GetSentences {

    private JSONArray JsonInfo() throws IOException {
        String jsonString = new String(Files.readAllBytes(Paths.get("Sentences.json")));
        JSONArray jsonArray = new JSONArray(jsonString);
        return jsonArray;
    }

    public JSONArray Words(int mission) throws IOException {
        JSONArray info = this.JsonInfo();
        if (info.getJSONObject(mission).has("sentence")) {
            JSONArray words = new JSONArray();
            String sentence = info.getJSONObject(mission).getString("sentence");
            String[] sentenceArr = sentence.split(" ");
            for (int j = 0; j < sentenceArr.length; j++) {
                words.put(sentenceArr[j]);
            }
            return words;
        } else if (info.getJSONObject(mission).has("order")) {
            JSONArray types = new JSONArray();
            String order = info.getJSONObject(mission).getString("order");
            String[] orderArr = order.split(" / ");
            for (int j = 0; j < orderArr.length; j++) {
                types.put(orderArr[j]);
            }
            return types;
        } else {
            throw new IOException("Misión no encontrada o fuera de rango");
        }
    }

    public String Questions(int mission) throws IOException {
        JSONArray info = this.JsonInfo();
        String question = new String();
        question = info.getJSONObject(mission).getString("question");
        return question;
    }

    public int Mission(int mission) throws IOException {
        JSONArray info = this.JsonInfo();
        int numMission = info.getJSONObject(mission).getInt("mission");
        return numMission;
    }
    
    public int NumSentences() throws IOException {
        JSONArray info = this.JsonInfo();
        return info.length();
    }
}
