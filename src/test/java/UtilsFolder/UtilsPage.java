package UtilsFolder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UtilsPage {
    public static void saveUserInfo(String firstName,String middleName, String lastName, String username, String password,String userId) throws IOException, ParseException {
        String filePath = "./src/test/resources/user.json";
        JSONParser parser = new JSONParser();
        JSONArray addedUser = (JSONArray) parser.parse(new FileReader(filePath));
        JSONObject userObject = new JSONObject();
        userObject.put("firstName", firstName);
        userObject.put("middleName", middleName);
        userObject.put("lastName", lastName);
        userObject.put("userName", username);
        userObject.put("password", password);
        userObject.put("UserId", userId);
        addedUser.add(userObject);

        FileWriter writer = new FileWriter(filePath);
        writer.write(addedUser.toJSONString());
        writer.flush();
        writer.close();
    }

    public static JSONObject getUser() throws IOException, ParseException {
        String filePath = "./src/test/resources/user.json";
        JSONParser parser = new JSONParser();
        JSONArray lastAddedArray = (JSONArray) parser.parse(new FileReader(filePath));
        JSONObject lastAddedUser = (JSONObject) lastAddedArray.get(lastAddedArray.size() - 1);
        return lastAddedUser;

    }

}
