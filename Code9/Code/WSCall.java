import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Scanner;

import com.google.gson.Gson;

public class WSCall {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 28081
		// 253802
		HashMap<String, Integer> map = new HashMap<>();
		map.put("sachin", 35320);
		map.put("dhoni", 28081);
		map.put("virat", 253802);
		
		String name = "";
		System.out.println("Enter the Query");
		name = new Scanner(System.in).next();
		//System.out.println(map.get(name));
		if(map.get(name)==null) {
			System.out.println("Invalid Player Name ");
			System.exit(0);
		}
		int playerid = map.get(name);
		System.out.println(playerid);
		String urlValue = "http://cricapi.com/api/playerStats?pid="+playerid+"&apikey=A8zoDoPaQgefmB7KunnSuApSgL73";
		URL url = new URL(urlValue);
		URLConnection con  = url.openConnection();
		con.connect();
		InputStream is = con.getInputStream();
		int singleByte = is.read();
		StringBuffer sb = new StringBuffer();
		while(singleByte!=-1) {
			sb.append((char)singleByte);
			singleByte = is.read();
		}
		is.close();
		System.out.println(sb);
		Gson gson = new Gson();
		JSONData data = gson.fromJson(sb.toString(), JSONData.class);
		
		System.out.println("Profile "+data.getProfile()+"\n Name "+data.getName()+"\n Country "+data.getCountry());
		
	}

}
