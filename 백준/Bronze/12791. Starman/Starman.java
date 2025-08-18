import java.io.*;
import java.util.*;

public class Main {
    static class Album {
        int year;
        String name;
        Album(int year, String name) {
            this.year = year;
            this.name = name;
        }
    }

    static Album[] albums = {
        new Album(1967, "DavidBowie"),
        new Album(1969, "SpaceOddity"),
        new Album(1970, "TheManWhoSoldTheWorld"),
        new Album(1971, "HunkyDory"),
        new Album(1972, "TheRiseAndFallOfZiggyStardustAndTheSpidersFromMars"),
        new Album(1973, "AladdinSane"),
        new Album(1973, "PinUps"),
        new Album(1974, "DiamondDogs"),
        new Album(1975, "YoungAmericans"),
        new Album(1976, "StationToStation"),
        new Album(1977, "Low"),
        new Album(1977, "Heroes"),
        new Album(1979, "Lodger"),
        new Album(1980, "ScaryMonstersAndSuperCreeps"),
        new Album(1983, "LetsDance"),
        new Album(1984, "Tonight"),
        new Album(1987, "NeverLetMeDown"),
        new Album(1993, "BlackTieWhiteNoise"),
        new Album(1995, "1.Outside"),
        new Album(1997, "Earthling"),
        new Album(1999, "Hours"),
        new Album(2002, "Heathen"),
        new Album(2003, "Reality"),
        new Album(2013, "TheNextDay"),
        new Album(2016, "BlackStar")
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int Q = Integer.parseInt(br.readLine());

        while (Q-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());

            List<Album> result = new ArrayList<>();
            for (Album a : albums) {
                if (a.year >= S && a.year <= E) {
                    result.add(a);
                }
            }

            sb.append(result.size()).append("\n");
            for (Album a : result) {
                sb.append(a.year).append(" ").append(a.name).append("\n");
            }
        }

        System.out.print(sb);
    }
}
